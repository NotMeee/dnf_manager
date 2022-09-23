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
            log.info(String.format("【%s】充值【%d】D币成功", account, ceranum));
            return HttpResult.success(1);
        } else {
            log.info(String.format("【%s】充值【%d】D币失败", account, ceranum));
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }

    @GetMapping("/cash/clear/cera")
    public HttpResult clearCera(String account) {
        int result = iCash.clearCeraByAccount(account);
        if (result == 1) {
            log.info(String.format("【%s】清空D币成功", account));
            return HttpResult.success(1);
        } else {
            log.info(String.format("【%s】清空D币失败", account));
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }

    @GetMapping("/cash/add/cerapoint")
    public HttpResult cashCeraPoint(String account, int cerapointnum) {
        CashCeraPoint ceraPoint = new CashCeraPoint();
        ceraPoint.setAccount(account);
        ceraPoint.setCeraPoint(cerapointnum);
        int result = iCash.updateCeraPointByAccount(ceraPoint);
        if (result == 1) {
            log.info(String.format("【%s】充值【%d】D点成功", account, cerapointnum));
            return HttpResult.success(1);
        } else {
            log.info(String.format("【%s】充值【%d】D点失败", account, cerapointnum));
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }

    @GetMapping("/cash/clear/cerapoint")
    public HttpResult clearCeraPoint(String account) {
        int result = iCash.clearCeraPointByAccount(account);
        if (result == 1) {
            log.info(String.format("【%s】清空D点成功", account));
            return HttpResult.success(1);
        } else {
            log.info(String.format("【%s】清空D点失败", account));
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }
}
