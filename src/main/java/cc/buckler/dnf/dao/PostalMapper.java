package cc.buckler.dnf.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostalMapper {
    int delPostal(int receiveCharacNo);
}