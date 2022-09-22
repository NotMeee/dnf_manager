package cc.buckler.dnf.service;

import cc.buckler.dnf.config.DataSource;
import cc.buckler.dnf.config.DataSourceType;
import cc.buckler.dnf.dao.*;
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
    @Autowired
    private MemberDungeonMapper memberDungeonMapper;
    @Autowired
    private CharacStatMapper characStatMapper;
    @Autowired
    private InventoryMapper inventoryMapper;
    @Autowired
    private UserItemsMapper userItemsMapper;
    @Autowired
    private CreatureItemsMapper creatureItemsMapper;

    @Override
    @DataSource(DataSourceType.cain)
    public List<CharacInfo> selectCharacListByMid(String account) {
        return characInfoMapper.selectCharacListByMid(account);
    }

    //清理任务模块 BEGIN
    @Override
    @DataSource(DataSourceType.cain)
    public int update1(int characNo) {
        return newCharacQuestMapper.update1(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update2(int characNo) {
        return newCharacQuestMapper.update2(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update3(int characNo) {
        return newCharacQuestMapper.update3(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update4(int characNo) {
        return newCharacQuestMapper.update4(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update5(int characNo) {
        return newCharacQuestMapper.update5(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update6(int characNo) {
        return newCharacQuestMapper.update6(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update7(int characNo) {
        return newCharacQuestMapper.update7(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain)
    public int update8(int characNo) {
        return newCharacQuestMapper.update8(characNo);
    }

    // 开启全图噩梦难度
    @Override
    @DataSource(DataSourceType.cain)
    public int openMap(int mId) {
        return memberDungeonMapper.openMap(mId);
    }

    // 开启左右槽
    @Override
    @DataSource(DataSourceType.cain)
    public int openSlot(int characNo) {
        return characStatMapper.openSlot(characNo);
    }

    // 清理包裹
    @Override
    @DataSource(DataSourceType.cain2nd)
    public int clearPack(int characNo) {
        return inventoryMapper.clearPack(characNo);
    }

    // 清理时装
    @Override
    @DataSource(DataSourceType.cain2nd)
    public int clearFashion(int characNo) {
        return userItemsMapper.clearFashion(characNo);
    }

    @Override
    @DataSource(DataSourceType.cain2nd)
    public int clearPet(int characNo) {
        return creatureItemsMapper.clearPet(characNo);
    }
}
