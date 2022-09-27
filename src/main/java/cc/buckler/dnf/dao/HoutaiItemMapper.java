package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.HoutaiItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HoutaiItemMapper {
    void dropItemTable();

    void createItemTable();

    int addItem(HoutaiItem houtaiItem);

    List<HoutaiItem> findAllItem();
}