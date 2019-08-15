package com.shxp.harbor.controller;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.SiteListQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.SiteService;
import com.shxp.harbor.vo.SiteListVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/site/basic")
public class SiteController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private SiteService siteService;

    @ApiOperation(value = "查询站点列表", tags = "站点管理")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "siteListQuery", value = "站点列表结构体", dataType = "SiteListQuery", paramType = "body")
    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BaseResponse<PageInfo<SiteListVO>> listSite(@RequestBody SiteListQuery siteListQuery) {
        return new BaseResponse<>(this.siteService.listSite(siteListQuery));
    }

}
