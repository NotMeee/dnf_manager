package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.Accounts;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountsMapper {
    Accounts selectByPrimaryKey(Integer uid);

    Accounts login(String accountname, String password);
}