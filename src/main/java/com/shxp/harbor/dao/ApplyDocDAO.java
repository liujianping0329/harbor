package com.shxp.harbor.dao;

import com.shxp.harbor.po.ApplyDoc;
import com.shxp.harbor.po.ApplyDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyDocDAO {
    long countByExample(ApplyDocExample example);

    int deleteByExample(ApplyDocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyDoc record);

    int insertSelective(ApplyDoc record);

    List<ApplyDoc> selectByExample(ApplyDocExample example);

    ApplyDoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplyDoc record, @Param("example") ApplyDocExample example);

    int updateByExample(@Param("record") ApplyDoc record, @Param("example") ApplyDocExample example);

    int updateByPrimaryKeySelective(ApplyDoc record);

    int updateByPrimaryKey(ApplyDoc record);
}