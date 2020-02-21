package com.shxp.harbor.controller;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.NewsListQuery;
import com.shxp.harbor.query.NewsQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.NewsService;
import com.shxp.harbor.vo.NewsListVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/news/basic")
public class NewsController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private NewsService newsService;

    @ApiOperation(value = "查询列表", tags = "新闻管理")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "newsListQuery", value = "列表结构体", dataType = "NewsListQuery", paramType = "body")
    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BaseResponse<PageInfo<NewsListVO>> listNews(@RequestBody NewsListQuery newsListQuery) {
        return new BaseResponse<>(this.newsService.listNews(newsListQuery));
    }

    @ApiOperation(value = "新增/修改", tags = "新闻管理")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "newsQuery", value = "结构体", dataType = "NewsQuery", paramType = "body")
    })
    @RequestMapping(value = "/upsert", method = RequestMethod.POST)
    public BaseResponse<Integer> upsertNews(@RequestBody NewsQuery newsQuery) {
        return new BaseResponse<>(this.newsService.upsertNews(newsQuery));
    }

}
