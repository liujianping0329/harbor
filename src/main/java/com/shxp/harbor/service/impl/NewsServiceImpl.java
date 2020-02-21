package com.shxp.harbor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shxp.harbor.dao.NewsDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shxp.harbor.vo.NewsListVO;
import com.shxp.harbor.query.NewsListQuery;
import com.shxp.harbor.query.NewsQuery;
import com.shxp.harbor.po.NewsExample;
import com.shxp.harbor.po.News;
import com.shxp.harbor.service.util.DataUtils;
import com.shxp.harbor.service.NewsService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAO newsDAO;

    @Override
    public PageInfo<NewsListVO> listNews(NewsListQuery newsListQuery) {
        NewsExample newsExample = new NewsExample();
        newsExample.setOrderByClause(" create_time desc ");
        NewsExample.Criteria criteria = newsExample.createCriteria();
        if(newsListQuery.getValid()!=null){
            criteria.andValidEqualTo(newsListQuery.getValid());
        }
        // TODO 加条件筛选
        PageHelper.startPage(newsListQuery.getPageIndex(), newsListQuery.getPageSize());
        List<News> newss = this.newsDAO.selectByExample(newsExample);
        PageInfo pageInfo = new PageInfo(newss);
        if (!DataUtils.isListAvali(newss)) return pageInfo;
        pageInfo.setList(newss.stream().map(news -> {
            NewsListVO newsListVO = new NewsListVO();
            BeanUtils.copyProperties(news, newsListVO);
            return newsListVO;
        }).collect(Collectors.toList()));
        return pageInfo;
    }

    @Override
    public Integer upsertNews(NewsQuery newsQuery) {
        News news = new News();
        BeanUtils.copyProperties(newsQuery, news);
        if (news.getId() != null) {
            this.newsDAO.updateByPrimaryKeySelective(news);
        } else {
            this.newsDAO.insertSelective(news);
        }
        return news.getId();
    }

}
