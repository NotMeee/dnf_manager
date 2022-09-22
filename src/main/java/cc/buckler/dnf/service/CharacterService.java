package cc.buckler.dnf.service;

import cc.buckler.dnf.config.DataSource;
import cc.buckler.dnf.config.DataSourceType;
import cc.buckler.dnf.dao.CharacInfoMapper;
import cc.buckler.dnf.dao.NewCharacQuestMapper;
import cc.buckler.dnf.pojo.CharacInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService implements ICharacter {
    @Autowired
    private CharacInfoMapper characInfoMapper;
    @Autowired
    private NewCharacQuestMapper newCharacQuestMapper;

    @Override
    @DataSource(DataSourceType.cain)
    public List<CharacInfo> selectCharacListByMid(String account) {
        return characInfoMapper.selectCharacListByMid(account);
    }

    //清理任务模块 BEGIN
    @Override
    @DataSource(DataSourceType.cain)
    public int update1(String characNo) {
        return newCharacQuestMapper.update1(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update2(String characNo) {
        return newCharacQuestMapper.update2(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update3(String characNo) {
        return newCharacQuestMapper.update3(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update4(String characNo) {
        return newCharacQuestMapper.update4(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update5(String characNo) {
        return newCharacQuestMapper.update5(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update6(String characNo) {
        return newCharacQuestMapper.update6(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update7(String characNo) {
        return newCharacQuestMapper.update7(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update8(String characNo) {
        return newCharacQuestMapper.update8(characNo);
    }
    //清理任务模块 END
}
