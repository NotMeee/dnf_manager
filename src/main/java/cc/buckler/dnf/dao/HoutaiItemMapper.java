package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.HoutaiItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HoutaiItemMapper {
    void dropItemTable();

    void createItemTable();

    int addItem(HoutaiItem item);

    List<HoutaiItem> findAllItem();

    List<HoutaiItem> findItemByLimit(int range);

    List<HoutaiItem> itemSearch(String keyword);
}