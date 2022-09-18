package cc.buckler.dnf.controller;

import cc.buckler.dnf.pojo.Accounts;
import cc.buckler.dnf.service.IAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private IAccounts iAccounts;

    @PostMapping("/login")
    public Accounts login(String accountname, String password) {
        Accounts account = iAccounts.login(accountname);
        if (password.equalsIgnoreCase(account.getPassword())) {
            return account;
        } else {
            return null;
        }
    }
}
