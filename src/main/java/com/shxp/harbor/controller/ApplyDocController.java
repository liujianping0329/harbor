package com.shxp.harbor.controller;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.ApplyDocListQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.ApplyDocService;
import com.shxp.harbor.vo.ApplyDocListVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/applyDoc/basic")
public class ApplyDocController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private ApplyDocService applyDocService;

    @ApiOperation(value = "查询申请资料列表", tags = "申请资料管理")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "applyDocListQuery", value = "申请资料列表结构体", dataType = "ApplyDocListQuery", paramType = "body")
    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BaseResponse<PageInfo<ApplyDocListVO>> listApplyDoc(@RequestBody ApplyDocListQuery applyDocListQuery) {
        return new BaseResponse<>(this.applyDocService.listApplyDoc(applyDocListQuery));
    }

//    @ApiOperation(value = "新增/修改申请资料", tags = "申请资料管理")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "applyDocQuery", value = "结构体", dataType = "ApplyDocQuery", paramType = "body")
//    })
//    @RequestMapping(value = "/upsert", method = RequestMethod.POST)
//    public BaseResponse<Integer> upsertApplyDoc(@RequestBody ApplyDocQuery applyDocQuery) {
//        return new BaseResponse<>(this.applyDocService.upsertApplyDoc(applyDocQuery));
//    }
//
//    @ApiOperation(value = "获取申请资料详情", tags = "申请资料管理")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "applyDocId", value = "applyDocId", dataType = "int", paramType = "query")
//    })
//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    public BaseResponse<ApplyDocVO> getApplyDocInfo(@RequestParam(value = "applyDocId") Integer applyDocId) {
//        return new BaseResponse<>(this.applyDocService.getApplyDocInfo(applyDocId));
//    }
}
