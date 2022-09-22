package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.Inventory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InventoryMapper {

    int clearPack(int characNo);
}