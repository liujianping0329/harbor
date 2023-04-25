package com.shxp.harbor.dao;

import com.shxp.harbor.po.Itemgroup;
import com.shxp.harbor.po.ItemgroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemgroupDAO {
    long countByExample(ItemgroupExample example);

    int deleteByExample(ItemgroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Itemgroup record);

    int insertSelective(Itemgroup record);

    List<Itemgroup> selectByExample(ItemgroupExample example);

    Itemgroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Itemgroup record, @Param("example") ItemgroupExample example);

    int updateByExample(@Param("record") Itemgroup record, @Param("example") ItemgroupExample example);

    int updateByPrimaryKeySelective(Itemgroup record);

    int updateByPrimaryKey(Itemgroup record);
}