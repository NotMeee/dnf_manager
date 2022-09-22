package cc.buckler.dnf.dao;

import cc.buckler.dnf.pojo.CreatureItems;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreatureItemsMapper {
    int clearPet(int characNo);
}