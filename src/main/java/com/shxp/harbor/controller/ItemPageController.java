package com.shxp.harbor.controller;

import com.shxp.harbor.query.*;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.ItemGroupService;
import com.shxp.harbor.service.ItemSelectPageService;
import com.shxp.harbor.vo.ItemGroupListVO;
import com.shxp.harbor.vo.ItemSelectPageListVO;
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
@RequestMapping("/api/itemPage")
public class ItemPageController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private ItemSelectPageService itemSelectPageService;

    @ApiOperation(value = "itemSelectPage", tags = "itemSelectPage")
    @RequestMapping(value = "/itemSelectPage", method = RequestMethod.POST)
    public BaseResponse<List<ItemSelectPageListVO>> getItemGroup(@RequestBody ItemSelectPageListQuery itemSelectPageListQuery) {
        List<ItemSelectPageListVO> itemSelectPageListVO = itemSelectPageService.getItemGroup(itemSelectPageListQuery);
        return new BaseResponse<>(itemSelectPageListVO);
    }



}
