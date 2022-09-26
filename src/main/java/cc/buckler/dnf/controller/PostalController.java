package cc.buckler.dnf.controller;

import cc.buckler.dnf.pojo.Postal;
import cc.buckler.dnf.service.IPostal;
import cc.buckler.dnf.utils.result.HttpResult;
import cc.buckler.dnf.utils.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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

    /**
     * @param characNo        角色ID
     * @param amplifyOption   是否红字 0-无，1-体力，2-精神，3-力量，4-智力
     * @param amplifyValue    附加值
     * @param seperateUpgrade 锻造等级
     * @param sealFlag        是否封装 0-无，1-封装
     * @param itemId          物品ID
     * @param num             数量
     * @param upgrade         强化等级
     * @return
     */
    @GetMapping("/postal/send")
    public HttpResult sendPostal(int characNo, byte amplifyOption, int amplifyValue, byte seperateUpgrade, byte sealFlag, int itemId, int num, byte upgrade) {
        Postal postal = new Postal();
        // 日期
        postal.setOccTime(new Date());
        // 发送人
        postal.setSendCharacName("GM");
        // 角色ID
        postal.setReceiveCharacNo(characNo);
        // 是否红字
        postal.setAmplifyOption(amplifyOption);
        // 附加值
        postal.setAmplifyValue(amplifyValue);
        // 锻造等级
        postal.setSeperateUpgrade(seperateUpgrade);
        // 是否封装
        postal.setSealFlag(sealFlag);
        // 物品ID
        postal.setItemId(itemId);
        // 数量
        postal.setAddInfo(num);
        // 强化等级
        postal.setUpgrade(upgrade);
        // 金币数量
        postal.setGold(0);
        // 最后的letter_id
        postal.setLetterId(iPostal.letterId() + 1);
        int result = iPostal.sendMail(postal);
        if (result == 1) {
            return HttpResult.success();
        } else {
            return HttpResult.failure(ResultCodeEnum.NOT_FOUND);
        }
    }
}
