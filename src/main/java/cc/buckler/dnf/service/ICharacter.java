package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.CharacInfo;

import java.util.List;

public interface ICharacter {
    List<CharacInfo> selectCharacListByMid(String account);

    // 清理任务模块 BEGIN
    int update1(int characNo);

    int update2(int characNo);

    int update3(int characNo);

    int update4(int characNo);

    int update5(int characNo);

    int update6(int characNo);

    int update7(int characNo);

    int update8(int characNo);
    // 清理任务模块 END

    // 开启全图噩梦难度
    int openMap(int mId);

    // 清理包裹
    int clearPack(int characNo);

    // 清理时装
    int clearFashion(int characNo);
}
