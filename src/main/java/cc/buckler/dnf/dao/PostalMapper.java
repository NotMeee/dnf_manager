package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.Postal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostalMapper {
    int delPostal(int receiveCharacNo);

    int sendMail(Postal postal);

    int letterId();
}