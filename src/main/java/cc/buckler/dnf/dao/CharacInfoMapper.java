package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.CharacInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CharacInfoMapper {
    List<CharacInfo> selectCharacListByMid(String account);
}