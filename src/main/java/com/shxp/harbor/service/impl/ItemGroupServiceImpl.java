package com.shxp.harbor.service.impl;

import com.shxp.harbor.dao.ItemgroupDAO;
import com.shxp.harbor.dao.UserDAO;
import com.shxp.harbor.exception.HarborException;
import com.shxp.harbor.po.Itemgroup;
import com.shxp.harbor.po.ItemgroupExample;
import com.shxp.harbor.po.User;
import com.shxp.harbor.po.UserExample;
import com.shxp.harbor.query.*;
import com.shxp.harbor.response.ResponseEnum;
import com.shxp.harbor.service.ItemGroupService;
import com.shxp.harbor.service.UserService;
import com.shxp.harbor.vo.ItemGroupListVO;
import com.shxp.harbor.vo.UserListVO;
import com.shxp.harbor.vo.UserLoginVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemGroupServiceImpl implements ItemGroupService {

    @Autowired
    private ItemgroupDAO itemgroupDAO;

       @Override
    public List<ItemGroupListVO>getItemGroup(ItemGroupListQuery itemGroupListQuery) {
           ItemgroupExample itemGroupExample=new ItemgroupExample();
            itemGroupExample.createCriteria();
            List<Itemgroup> itemGroups = itemgroupDAO.selectByExample(itemGroupExample);

            return itemGroups.stream().map(user->{
            ItemGroupListVO itemgroupListVO=new ItemGroupListVO();
            BeanUtils.copyProperties(user,itemgroupListVO);
            return itemgroupListVO;
        }).collect(Collectors.toList());
    }

    @Override
    public Integer deleteItemGroup(ItemGroupDeleteQuery itemGroupDeleteQuery) {
        return itemgroupDAO.deleteByPrimaryKey(itemGroupDeleteQuery.getId());
    }

    @Override
    public Integer insertItemGroup(ItemGroupInsertQuery itemGroupInsertQuery) {
        Itemgroup itemgroup=new Itemgroup();
        BeanUtils.copyProperties(itemGroupInsertQuery,itemgroup);
        return itemgroupDAO.insertSelective(itemgroup);
    }

    @Override
    public Integer updateItemGroup(ItemGroupUpdateQuery itemGroupUpdateQuery) {
        Itemgroup itemgroup=new Itemgroup();
        BeanUtils.copyProperties(itemGroupUpdateQuery,itemgroup);
        return itemgroupDAO.updateByPrimaryKeySelective(itemgroup);
    }
}
