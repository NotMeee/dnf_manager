package cc.buckler.dnf.service;

import cc.buckler.dnf.config.DataSource;
import cc.buckler.dnf.config.DataSourceType;
import cc.buckler.dnf.dao.AccountsMapper;
import cc.buckler.dnf.pojo.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService implements IAccounts {

    @Autowired
    private AccountsMapper accountsMapper;

    @Override
    @DataSource(DataSourceType.taiwan)
    public Accounts selectByPrimaryKey(Integer uid) {
        return accountsMapper.selectByPrimaryKey(uid);
    }

    @Override
    @DataSource(DataSourceType.taiwan)
    public Accounts login(String accountname,String password) {
        return accountsMapper.login(accountname,password);
    }
}
