package cc.buckler.dnf.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjingzong
 * @description MyBatis配置
 */
@Configuration
@MapperScan(basePackages = "cc.buckler.dnf.dao")
public class MyBatisConfig {
    @Primary
    @Bean("taiwanDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.taiwan")
    public DataSource taiwanDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean("billingDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.billing")
    public DataSource billingDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean("cainDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.cain")
    public DataSource cainDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean("cain2ndDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.cain2nd")
    public DataSource cain2ndDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean("houtaiDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.houtai")
    public DataSource houtaiDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DynamicDataSource dataSource(@Qualifier("taiwanDataSource") DataSource taiwanDataSource,
                                        @Qualifier("billingDataSource") DataSource billingDataSource,
                                        @Qualifier("cainDataSource") DataSource cainDataSource,
                                        @Qualifier("cain2ndDataSource") DataSource cain2ndDataSource,
                                        @Qualifier("houtaiDataSource") DataSource houtaiDataSource) {
        Map<Object, Object> map = new HashMap<>();
        map.put(DataSourceType.taiwan, taiwanDataSource);
        map.put(DataSourceType.billing, billingDataSource);
        map.put(DataSourceType.cain, cainDataSource);
        map.put(DataSourceType.cain2nd, cain2ndDataSource);
        map.put(DataSourceType.houtai, houtaiDataSource);

        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(taiwanDataSource);

        return dynamicDataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DynamicDataSource dynamicDataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dynamicDataSource);
        //配置实体类目录
        factoryBean.setTypeAliasesPackage("cc.buckler.dnf.pojo");
        //添加驼峰命名法映射
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:cc/buckler/dnf/mapper/*.xml");
        factoryBean.setMapperLocations(resources);
        //添加到factoryBean里
        factoryBean.setConfiguration(configuration);
        return factoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager(DynamicDataSource dynamicDataSource) {
        return new DataSourceTransactionManager(dynamicDataSource);
    }
}