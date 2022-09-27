package cc.buckler.dnf.service;

import cc.buckler.dnf.config.DataSource;
import cc.buckler.dnf.config.DataSourceType;
import cc.buckler.dnf.dao.HoutaiItemMapper;
import cc.buckler.dnf.pojo.HoutaiItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoutaiItemService implements IHoutaiItem {
    @Autowired
    private HoutaiItemMapper houtaiItemMapper;

    @Override
    @DataSource(DataSourceType.cain)
    public void createItemTable() {
        houtaiItemMapper.dropItemTable();
        houtaiItemMapper.createItemTable();
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int addItem(HoutaiItem houtaiItem) {
        return houtaiItemMapper.addItem(houtaiItem);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public List<HoutaiItem> findAllItem() {
        return houtaiItemMapper.findAllItem();
    }
}
