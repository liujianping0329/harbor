package com.shxp.harbor.controller;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.HotImeiListQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.HotImeiService;
import com.shxp.harbor.vo.HotImeiListVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/hotImei/basic")
public class HotImeiController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private HotImeiService hotImeiService;

    @ApiOperation(value = "查询热点imei列表", tags = "热点imei管理")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "hotImeiListQuery", value = "热点imei列表结构体", dataType = "HotImeiListQuery", paramType = "body")
    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BaseResponse<PageInfo<HotImeiListVO>> listHotImei(@RequestBody HotImeiListQuery hotImeiListQuery) {
        return new BaseResponse<>(this.hotImeiService.listHotImei(hotImeiListQuery));
    }

//    @ApiOperation(value = "新增/修改热点imei", tags = "热点imei管理")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "hotImeiQuery", value = "结构体", dataType = "HotImeiQuery", paramType = "body")
//    })
//    @RequestMapping(value = "/upsert", method = RequestMethod.POST)
//    public BaseResponse<Integer> upsertHotImei(@RequestBody HotImeiQuery hotImeiQuery) {
//        return new BaseResponse<>(this.hotImeiService.upsertHotImei(hotImeiQuery));
//    }
//
//    @ApiOperation(value = "获取热点imei详情", tags = "热点imei管理")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "hotImeiId", value = "hotImeiId", dataType = "int", paramType = "query")
//    })
//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    public BaseResponse<HotImeiVO> getHotImeiInfo(@RequestParam(value = "hotImeiId") Integer hotImeiId) {
//        return new BaseResponse<>(this.hotImeiService.getHotImeiInfo(hotImeiId));
//    }
}
