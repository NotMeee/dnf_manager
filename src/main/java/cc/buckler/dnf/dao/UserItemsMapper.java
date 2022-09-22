package cc.buckler.dnf.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserItemsMapper {
    int clearFashion(int characNo);
}