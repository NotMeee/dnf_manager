package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.CashCera;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CashCeraMapper {
    CashCera selectCeraByPrimaryKey(String account);

    int updateCeraByAccount(CashCera cashCera);
}