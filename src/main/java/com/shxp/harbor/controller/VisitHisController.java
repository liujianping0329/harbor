package com.shxp.harbor.controller;

import com.shxp.harbor.query.VisitHisQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.VisitHisService;
import com.shxp.harbor.vo.StatisticsVO;
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
@RequestMapping("/api/visit/his")
public class VisitHisController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private VisitHisService visitHisService;

    @ApiOperation(value = "新增浏览记录,进主页的时候调用的", tags = "浏览历史")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseResponse<Integer> addHis(@RequestBody VisitHisQuery visitHisQuery) {
        return new BaseResponse<>(visitHisService.addHis(visitHisQuery));
    }

    @ApiOperation(value = "获取省份统计信息", tags = "浏览历史")
    @RequestMapping(value = "/get/provice", method = RequestMethod.GET)
    public BaseResponse<List<StatisticsVO>> getProviceSta() {
        return new BaseResponse<>(visitHisService.getProvinceSta());
    }


}
