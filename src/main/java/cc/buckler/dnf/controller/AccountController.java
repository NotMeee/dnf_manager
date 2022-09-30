package cc.buckler.dnf.controller;

import cc.buckler.dnf.pojo.Accounts;
import cc.buckler.dnf.service.IAccounts;
import cc.buckler.dnf.utils.result.HttpResult;
import cc.buckler.dnf.utils.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class AccountController {
    @Autowired
    private IAccounts iAccounts;

    @GetMapping("/login")
    public HttpResult login(String accountname, String password) {
        Accounts account = iAccounts.login(accountname, password);
        if (account != null) {
            Map<String, Object> map = new HashMap<>();
            map.put("uid", account.getUid());
            map.put("accountname", account.getAccountname());
            log.info(String.format("【%s】登录成功！", accountname));
            return HttpResult.success(map);
        } else {
            log.info(String.format("【%s】登录失败！", accountname));
            return HttpResult.failure(ResultCodeEnum.LOGIN_ERROR);
        }
    }
}