package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.Accounts;

public interface IAccounts {

    Accounts selectByPrimaryKey(Integer uid);

    Accounts login(String accountname, String password);
}
