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

import javax.sound.midi.MidiChannel;
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
     * @param characNo 角色ID
     * @return
     */
    @GetMapping("/character/quest")
    public HttpResult clearQuest(int characNo) {
        iCharacter.update1(characNo);
        iCharacter.update2(characNo);
        iCharacter.update3(characNo);
        iCharacter.update4(characNo);
        iCharacter.update5(characNo);
        iCharacter.update6(characNo);
        iCharacter.update7(characNo);
        int result = iCharacter.update8(characNo);
        if (result == 1) {
            log.info(String.format("角色ID【%d】已清理全部主线任务", characNo));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.FINISH_QUEST_FAILURE);
        }
    }

    /**
     * 开启全图噩梦模式
     *
     * @param mId 账号UID
     * @return
     */
    @GetMapping("/character/openmap")
    public HttpResult openMap(int mId) {
        int result = iCharacter.openMap(mId);
        if (result == 1) {
            log.info(String.format("UID【%d】已清理全部主线任务", mId));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.OPEN_MAP_FAILURE);
        }
    }

    /**
     * 开启左右槽
     *
     * @param characNo 角色ID
     * @return
     */
    @GetMapping("/character/openslot")
    public HttpResult openSlot(int characNo) {
        int result = iCharacter.openSlot(characNo);
        if (result == 1) {
            log.info(String.format("角色ID【%d】已开启左右槽", characNo));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.OPEN_MAP_FAILURE);
        }
    }

    /**
     * 清理包裹
     *
     * @param characNo 角色ID
     * @return
     */
    @GetMapping("/character/clearpack")
    public HttpResult clearPack(int characNo) {
        int result = iCharacter.clearPack(characNo);
        if (result == 1) {
            log.info(String.format("角色ID【%d】背包已清理", characNo));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.CLEAR_PACK_FAILURE);
        }
    }

    /**
     * 清理时装
     *
     * @param characNo 角色ID
     * @return
     */
    @GetMapping("/character/clearfashion")
    public HttpResult clearFashion(int characNo) {
        int result = iCharacter.clearFashion(characNo);
        if (result >= 0) {
            log.info(String.format("角色ID【%d】时装已清理", characNo));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.CLEAR_FASHION_FAILURE);
        }
    }

    /**
     * 清理宠物
     *
     * @param characNo 角色ID
     * @return
     */
    @GetMapping("/character/clearpet")
    public HttpResult clearPet(int characNo) {
        int result = iCharacter.clearPet(characNo);
        if (result >= 0) {
            log.info(String.format("角色ID【%d】宠物已清理", characNo));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.CLEAR_PET_FAILURE);
        }
    }

    @GetMapping("/character/jobturn")
    public HttpResult jobTurn(int job, int growType, int characNo) {
        int result = iCharacter.jobTurn(job, growType, characNo);
        if (result == 1) {
            log.info(String.format("角色ID【%d】转职成功", characNo));
            return HttpResult.success(result);
        } else {
            return HttpResult.failure(ResultCodeEnum.JOB_TURN_FAILURE);
        }
    }
}
