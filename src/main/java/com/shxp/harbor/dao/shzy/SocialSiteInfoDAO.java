package com.shxp.harbor.dao.shzy;

import com.shxp.harbor.po.SocialSiteInfo;
import com.shxp.harbor.po.SocialSiteInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocialSiteInfoDAO {
    long countByExample(SocialSiteInfoExample example);

    int deleteByExample(SocialSiteInfoExample example);

    int insert(SocialSiteInfo record);

    int insertSelective(SocialSiteInfo record);

    List<SocialSiteInfo> selectByExample(SocialSiteInfoExample example);

    int updateByExampleSelective(@Param("record") SocialSiteInfo record, @Param("example") SocialSiteInfoExample example);

    int updateByExample(@Param("record") SocialSiteInfo record, @Param("example") SocialSiteInfoExample example);
}