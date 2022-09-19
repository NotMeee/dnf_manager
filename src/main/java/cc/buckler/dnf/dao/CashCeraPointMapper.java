package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.CashCeraPoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CashCeraPointMapper {
    CashCeraPoint selectCeraPointByPrimaryKey(String account);

    int updateCeraPointByAccount(CashCeraPoint cashCeraPoint);
}