package cc.buckler.dnf.controller;

import cc.buckler.dnf.service.IPostal;
import cc.buckler.dnf.utils.result.HttpResult;
import cc.buckler.dnf.utils.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: buckler
 * @Date: 2022/9/25 14:03
 * @Describe:
 */
@RestController
@Slf4j
public class PostalController {
    @Autowired
    private IPostal iPostal;

    /**
     * 删除邮件
     *
     * @param characNo 角色ID
     * @return
     */
    @GetMapping("/postal/delete")
    public HttpResult delPostal(int characNo) {
        int result = iPostal.delPostal(characNo);
        if (result >= 0) {
            log.info(String.format("角色ID【%d】邮件已清理", characNo));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }

    // 发送邮件
    @GetMapping("/postal/send")
    public HttpResult sendPostal() {

        return HttpResult.success();
    }
}
