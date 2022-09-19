package cc.buckler.dnf.controller;

import cc.buckler.dnf.pojo.Accounts;
import cc.buckler.dnf.utils.result.HttpResult;
import cc.buckler.dnf.utils.result.ResultCodeEnum;
import cc.buckler.dnf.service.IAccounts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
        try {
            Accounts account = iAccounts.login(accountname);
            if (password.equalsIgnoreCase(account.getPassword())) {
                log.info(String.format("【%s】登录成功！", accountname));
                Map<String, String> map = new HashMap<>();
                map.put("isSuccess", "true");
                map.put("info", String.format("【%s】登录成功！", accountname));
                return HttpResult.success(map);
            } else {
                return HttpResult.failure(ResultCodeEnum.LOGIN_ERROR);
            }
        } catch (Exception e) {
            log.error(e.toString());
            return HttpResult.failure(ResultCodeEnum.LOGIN_ERROR);
        }
    }
}