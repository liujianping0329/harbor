package com.shxp.harbor.dao.shzy;

import com.shxp.harbor.po.SocialHotImeilog;
import com.shxp.harbor.po.SocialHotImeilogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocialHotImeilogDAO {
    long countByExample(SocialHotImeilogExample example);

    int deleteByExample(SocialHotImeilogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SocialHotImeilog record);

    int insertSelective(SocialHotImeilog record);

    List<SocialHotImeilog> selectByExample(SocialHotImeilogExample example);

    SocialHotImeilog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SocialHotImeilog record, @Param("example") SocialHotImeilogExample example);

    int updateByExample(@Param("record") SocialHotImeilog record, @Param("example") SocialHotImeilogExample example);

    int updateByPrimaryKeySelective(SocialHotImeilog record);

    int updateByPrimaryKey(SocialHotImeilog record);
}