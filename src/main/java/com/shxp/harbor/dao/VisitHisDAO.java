package com.shxp.harbor.dao;

import com.shxp.harbor.po.VisitHis;
import com.shxp.harbor.po.VisitHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitHisDAO {
    long countByExample(VisitHisExample example);

    int deleteByExample(VisitHisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VisitHis record);

    int insertSelective(VisitHis record);

    List<VisitHis> selectByExample(VisitHisExample example);

    VisitHis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VisitHis record, @Param("example") VisitHisExample example);

    int updateByExample(@Param("record") VisitHis record, @Param("example") VisitHisExample example);

    int updateByPrimaryKeySelective(VisitHis record);

    int updateByPrimaryKey(VisitHis record);
}