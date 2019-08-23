package com.shxp.harbor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shxp.harbor.dao.shzy.SocialSiteInfoDAO;
import com.shxp.harbor.po.SocialSiteInfo;
import com.shxp.harbor.po.SocialSiteInfoExample;
import com.shxp.harbor.query.SiteListQuery;
import com.shxp.harbor.service.SiteService;
import com.shxp.harbor.service.util.DataUtils;
import com.shxp.harbor.vo.SiteListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SiteServiceImpl implements SiteService {

    @Autowired
    private SocialSiteInfoDAO socialSiteInfoDAO;

    @Override
    public PageInfo<SiteListVO> listSite(SiteListQuery siteListQuery) {
        SocialSiteInfoExample socialSiteInfoExample = new SocialSiteInfoExample();
//        socialSiteInfoExample.setOrderByClause(" update_at desc ");
        SocialSiteInfoExample.Criteria criteria = socialSiteInfoExample.createCriteria();
        // TODO 加条件筛选
        criteria.andParentidEqualTo("1");
        if(siteListQuery.getSiteIds()!=null){
            if(siteListQuery.getSiteIds().size()!=0){
                criteria.andSiteIdIn(siteListQuery.getSiteIds());
            }
        }
        PageHelper.startPage(siteListQuery.getPageIndex(), siteListQuery.getPageSize());
        List<SocialSiteInfo> socialSiteInfos = this.socialSiteInfoDAO.selectByExample(socialSiteInfoExample);
        PageInfo pageInfo = new PageInfo(socialSiteInfos);
        if (!DataUtils.isListAvali(socialSiteInfos)) return pageInfo;
        // TODO 要不要查点别的?
        pageInfo.setList(socialSiteInfos.stream().map(socialSiteInfo -> {
            SiteListVO siteListVO = new SiteListVO();
            BeanUtils.copyProperties(socialSiteInfo, siteListVO);
            return siteListVO;
        }).collect(Collectors.toList()));
        return pageInfo;
    }

}
