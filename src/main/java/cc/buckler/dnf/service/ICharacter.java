package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.CharacInfo;

import java.util.List;

public interface ICharacter {
    List<CharacInfo> selectCharacListByMid(String account);

    // 清理任务模块 BEGIN
    int update1(String characNo);

    int update2(String characNo);

    int update3(String characNo);

    int update4(String characNo);

    int update5(String characNo);

    int update6(String characNo);

    int update7(String characNo);

    int update8(String characNo);
    //清理任务模块 END
}
