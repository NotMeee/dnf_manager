package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.CharacInfo;

import java.util.List;

public interface INewCharacQuest {
    List<CharacInfo> selectCharacListByMid(String account);
}
