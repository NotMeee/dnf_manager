package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.CharacInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CharacInfoMapper {
    List<CharacInfo> selectCharacListByMid(String account);

    // 转职
    int jobTurn(int job, int growType, int characNo);
}