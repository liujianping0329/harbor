package com.shxp.harbor.service;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.SiteListQuery;
import com.shxp.harbor.vo.SiteListVO;

public interface SiteService {
    PageInfo<SiteListVO> listSite(SiteListQuery siteListQuery);
}
