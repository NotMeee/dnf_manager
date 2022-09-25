package cc.buckler.dnf.service;

import cc.buckler.dnf.config.DataSource;
import cc.buckler.dnf.config.DataSourceType;
import cc.buckler.dnf.dao.PostalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: buckler
 * @Date: 2022/9/25 13:51
 * @Describe:
 */
@Service
public class PostalService implements IPostal {

    @Autowired
    private PostalMapper postalMapper;

    @Override
    @DataSource(DataSourceType.cain2nd)
    public int delPostal(int receiveCharacNo) {
        return postalMapper.delPostal(receiveCharacNo);
    }
}
