package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.CashCera;
import cc.buckler.dnf.pojo.CashCeraPoint;

public interface ICash {
    //查询D币余额
    CashCera selectCeraByPrimaryKey(String account);

    //添加D币余额
    int updateCeraByAccount(CashCera cashCera);

    //查询D点余额
    CashCeraPoint selectCeraPointByPrimaryKey(String account);

    //添加D点余额
    int updateCeraPointByAccount(CashCeraPoint cashCeraPoint);

    //清理D币
    int clearCeraByAccount(String account);

    //清理D点
    int clearCeraPointByAccount(String account);
}
