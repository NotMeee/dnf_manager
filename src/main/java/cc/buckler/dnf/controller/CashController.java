package cc.buckler.dnf.controller;

import cc.buckler.dnf.pojo.CashCera;
import cc.buckler.dnf.pojo.CashCeraPoint;
import cc.buckler.dnf.service.ICash;
import cc.buckler.dnf.utils.result.HttpResult;
import cc.buckler.dnf.utils.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class CashController {
    @Autowired
    private ICash iCash;

    @GetMapping("/cash/cera")
    public HttpResult cashCera(String account, int ceranum) {
        CashCera cera = new CashCera();
        cera.setAccount(account);
        cera.setCera(iCash.selectCeraByPrimaryKey(account).getCera() + ceranum);
        int result = iCash.updateCeraByAccount(cera);
        Map<String, String> map = new HashMap<>();
        map.put("result", "1");
        map.put("msg", "D币充值成功");
        if (result == 1) {
            return HttpResult.success(map);
        } else {
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }

    @GetMapping("/cash/cerapoint")
    public HttpResult cashCeraPoint(String account, int cerapointnum) {
        CashCeraPoint ceraPoint = new CashCeraPoint();
        ceraPoint.setAccount(account);
        ceraPoint.setCeraPoint(cerapointnum);
        int result = iCash.updateCeraPointByAccount(ceraPoint);
        Map<String, String> map = new HashMap<>();
        map.put("result", "1");
        map.put("msg", "D点充值成功");
        if (result == 1) {
            return HttpResult.success(map);
        } else {
            return HttpResult.success();
        }
    }
}
