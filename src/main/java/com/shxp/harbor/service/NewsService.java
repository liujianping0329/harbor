package com.shxp.harbor.service;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.NewsListQuery;
import com.shxp.harbor.query.NewsQuery;
import com.shxp.harbor.vo.NewsListVO;

public interface NewsService {
    PageInfo<NewsListVO> listNews(NewsListQuery newsListQuery);

    Integer upsertNews(NewsQuery newsQuery);
}
