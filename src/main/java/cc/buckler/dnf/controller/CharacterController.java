package cc.buckler.dnf.controller;

import cc.buckler.dnf.pojo.CharacInfo;
import cc.buckler.dnf.service.ICharacter;
import cc.buckler.dnf.utils.CharSetUtil;
import cc.buckler.dnf.utils.result.HttpResult;
import cc.buckler.dnf.utils.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class CharacterController {

    @Autowired
    private ICharacter iCharacter;

    /**
     * 获取账号下的角色列表
     *
     * @param account 账号UID
     * @return
     */
    @GetMapping("/character/list")
    public HttpResult characterInfoList(String account) {
        List<CharacInfo> characterList = iCharacter.selectCharacListByMid(account);
        List<CharacInfo> charac = new ArrayList<>();
        for (int i = 0; i < characterList.size(); i++) {
            CharacInfo characInfo = new CharacInfo();
            characInfo.setmId(characterList.get(i).getmId());
            characInfo.setCharacNo(characterList.get(i).getCharacNo());
            characInfo.setCharacName(CharSetUtil.convertCharset(characterList.get(i).getCharacName()));
            characInfo.setJob(characterList.get(i).getJob());
            characInfo.setLev(characterList.get(i).getLev());
            charac.add(characInfo);
        }
        if (characterList.size() > 0) {
            return HttpResult.success(charac);
        } else {
            return HttpResult.failure(ResultCodeEnum.NOT_FOUND);
        }
    }

    /**
     * 清理全部主线任务
     *
     * @param account 账号UID
     * @return
     */
    @GetMapping("/character/quest")
    public HttpResult clearQuest(String account) {
        iCharacter.update1(account);
        iCharacter.update2(account);
        iCharacter.update3(account);
        iCharacter.update4(account);
        iCharacter.update5(account);
        iCharacter.update6(account);
        iCharacter.update7(account);
        int result = iCharacter.update8(account);
        if (result == 1) {
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.FINISH_QUEST_FAILURE);
        }
    }
}
