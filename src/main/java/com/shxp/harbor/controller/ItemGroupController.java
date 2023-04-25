package com.shxp.harbor.controller;

import com.shxp.harbor.query.*;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.ItemGroupService;
import com.shxp.harbor.vo.ItemGroupListVO;
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
@RequestMapping("/api/item")
public class ItemGroupController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private ItemGroupService itemGroupService;

    @ApiOperation(value = "getItemGroup", tags = "getItemGroup")
    @RequestMapping(value = "/getItemGroup", method = RequestMethod.POST)
    public BaseResponse<List<ItemGroupListVO>> getItemGroup(@RequestBody ItemGroupListQuery itemGroupListQuery) {
        List<ItemGroupListVO> itemgroupListVO = itemGroupService.getItemGroup(itemGroupListQuery);
        return new BaseResponse<>(itemgroupListVO);
    }
    @ApiOperation(value = "deleteItemGroup", tags = "deleteItemGroup")
    @RequestMapping(value = "/deleteItemGroup", method = RequestMethod.POST)
    public BaseResponse<Integer> deleteItemGroup(@RequestBody ItemGroupDeleteQuery itemGroupDeleteQuery) {
        Integer res = itemGroupService.deleteItemGroup(itemGroupDeleteQuery);
        return new BaseResponse<>(res);
    }

    @ApiOperation(value = "insertItemGroup", tags = "insertItemGroup")
    @RequestMapping(value = "/insertItemGroup", method = RequestMethod.POST)
    public BaseResponse<Integer> insertItemGroup(@RequestBody ItemGroupInsertQuery itemGroupInsertQuery) {
        Integer res = itemGroupService.insertItemGroup(itemGroupInsertQuery);
        return new BaseResponse<>(res);
    }

    @ApiOperation(value = "updateItemGroup", tags = "updateItemGroup")
    @RequestMapping(value = "/updateItemGroup", method = RequestMethod.POST)
    public BaseResponse<Integer> updateItemGroup(@RequestBody ItemGroupUpdateQuery itemGroupUpdateQuery) {
        Integer res = itemGroupService.updateItemGroup(itemGroupUpdateQuery);
        return new BaseResponse<>(res);
    }


}
