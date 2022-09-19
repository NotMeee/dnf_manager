package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.CashCera;
import cc.buckler.dnf.pojo.CashCeraPoint;

public interface ICash {
    CashCera selectCeraByPrimaryKey(String account);

    int updateCeraByAccount(CashCera cashCera);

    CashCeraPoint selectCeraPointByPrimaryKey(String account);

    int updateCeraPointByAccount(CashCeraPoint cashCeraPoint);
}
