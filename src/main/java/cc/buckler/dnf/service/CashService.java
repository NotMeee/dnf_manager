package cc.buckler.dnf.service;

import cc.buckler.dnf.config.DataSource;
import cc.buckler.dnf.config.DataSourceType;
import cc.buckler.dnf.dao.CashCeraMapper;
import cc.buckler.dnf.dao.CashCeraPointMapper;
import cc.buckler.dnf.pojo.CashCera;
import cc.buckler.dnf.pojo.CashCeraPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashService implements ICash {
    @Autowired
    private CashCeraMapper cashCeraMapper;
    @Autowired
    private CashCeraPointMapper cashCeraPointMapper;

    @Override
    @DataSource(DataSourceType.billing)
    public CashCera selectCeraByPrimaryKey(String account) {
        return cashCeraMapper.selectCeraByPrimaryKey(account);
    }

    @Override
    @DataSource(DataSourceType.billing)
    public int updateCeraByAccount(CashCera cashCera) {
        return cashCeraMapper.updateCeraByAccount(cashCera);
    }

    @Override
    @DataSource(DataSourceType.billing)
    public CashCeraPoint selectCeraPointByPrimaryKey(String account) {
        return cashCeraPointMapper.selectCeraPointByPrimaryKey(account);
    }

    @Override
    @DataSource(DataSourceType.billing)
    public int updateCeraPointByAccount(CashCeraPoint cashCeraPoint) {
        return cashCeraPointMapper.updateCeraPointByAccount(cashCeraPoint);
    }
}
