package cc.buckler.dnf.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CharacStatMapper {
    int openSlot(int characNo);
}