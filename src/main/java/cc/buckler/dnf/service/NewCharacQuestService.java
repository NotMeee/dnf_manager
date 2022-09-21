package cc.buckler.dnf.service;

import cc.buckler.dnf.config.DataSource;
import cc.buckler.dnf.config.DataSourceType;
import cc.buckler.dnf.dao.CharacInfoMapper;
import cc.buckler.dnf.pojo.CharacInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewCharacQuestService implements INewCharacQuest {
    @Autowired
    private CharacInfoMapper characInfoMapper;

    @Override
    @DataSource(DataSourceType.cain)
    public List<CharacInfo> selectCharacListByMid(String account) {
        return characInfoMapper.selectCharacListByMid(account);
    }
}
