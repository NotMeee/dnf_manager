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

    @GetMapping("/cash/add/cera")
    public HttpResult cashCera(String account, int ceranum) {
        CashCera cera = new CashCera();
        cera.setAccount(account);
        cera.setCera(iCash.selectCeraByPrimaryKey(account).getCera() + ceranum);
        int result = iCash.updateCeraByAccount(cera);
        if (result == 1) {
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }

    @GetMapping("/cash/clear/cera")
    public HttpResult clearCera(String account) {
        int result = iCash.clearCeraByAccount(account);
        if (result == 1) {
            return HttpResult.success(1);
        } else {
            return HttpResult.success(ResultCodeEnum.CASH_ERROR);
        }
    }

    @GetMapping("/cash/add/cerapoint")
    public HttpResult cashCeraPoint(String account, int cerapointnum) {
        CashCeraPoint ceraPoint = new CashCeraPoint();
        ceraPoint.setAccount(account);
        ceraPoint.setCeraPoint(cerapointnum);
        int result = iCash.updateCeraPointByAccount(ceraPoint);
        if (result == 1) {
            return HttpResult.success(1);
        } else {
            return HttpResult.success();
        }
    }

    @GetMapping("/cash/clear/cerapoint")
    public HttpResult clearCeraPoint(String account) {
        int result = iCash.clearCeraPointByAccount(account);
        if (result == 1) {
            return HttpResult.success(1);
        } else {
            return HttpResult.success(ResultCodeEnum.CASH_ERROR);
        }
    }
}
