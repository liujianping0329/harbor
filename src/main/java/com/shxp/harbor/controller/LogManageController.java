package com.shxp.harbor.controller;

import com.shxp.harbor.query.LogManageListQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.ItemGroupService;
import com.shxp.harbor.service.LogManageService;
import com.shxp.harbor.vo.LogManageListVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/log")
public class LogManageController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private LogManageService LogManageService;

    @ApiOperation(value = "getlogManage", tags = "getlogManage")
    @RequestMapping(value = "/getlogManage", method = RequestMethod.POST)
    public BaseResponse<List<LogManageListVO>> getLogManageGroup(@RequestBody LogManageListQuery logManageListQuery) {
        List<LogManageListVO> logManageListVO = LogManageService.getLogManageGroup(logManageListQuery);
        return new BaseResponse<>(logManageListVO);
    }



}
