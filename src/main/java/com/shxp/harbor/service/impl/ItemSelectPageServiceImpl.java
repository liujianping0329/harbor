package com.shxp.harbor.service.impl;

import com.shxp.harbor.dao.ItemDAO;
import com.shxp.harbor.dao.ItemgroupDAO;
import com.shxp.harbor.po.Item;
import com.shxp.harbor.po.ItemExample;
import com.shxp.harbor.po.Itemgroup;
import com.shxp.harbor.po.ItemgroupExample;
import com.shxp.harbor.query.*;
import com.shxp.harbor.service.ItemGroupService;
import com.shxp.harbor.service.ItemSelectPageService;
import com.shxp.harbor.vo.ItemGroupListVO;
import com.shxp.harbor.vo.ItemSelectPageListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemSelectPageServiceImpl implements ItemSelectPageService {

    @Autowired
    private ItemDAO itemDAO;

    @Autowired
    private ItemgroupDAO itemgroupDAO;

       @Override
    public List<ItemSelectPageListVO> getItemGroup(ItemSelectPageListQuery itemSelectPageListQuery) {
           ItemExample itemExample=new ItemExample();
            itemExample.createCriteria().andItemGroupIdEqualTo(itemSelectPageListQuery.getItemGroupId());
            List<Item> itemSelectPage = itemDAO.selectByExample(itemExample);

           HashSet<Integer> idGroupId = new HashSet<Integer>();
           for (int i = 0; i < itemSelectPage.size(); i++) {
               idGroupId.add(itemSelectPage.get(i).getItemGroupId());
           }
           List<Integer> idGroupIdList = new ArrayList<>();
           for (Integer a1 :idGroupId){
               idGroupIdList.add(a1);
           }

           ItemgroupExample itemgroupExample = new ItemgroupExample();
           itemgroupExample.createCriteria().andIdIn(idGroupIdList);
           List<Itemgroup> itemgroups = itemgroupDAO.selectByExample(itemgroupExample);
           Map<Integer,String> maps=new HashMap<>();
           for (Itemgroup itemgroup : itemgroups) {
               maps.put(itemgroup.getId(),itemgroup.getName());
           }

           return itemSelectPage.stream().map(user->{
                ItemSelectPageListVO itemSelectPageListVO=new ItemSelectPageListVO();
                BeanUtils.copyProperties(user,itemSelectPageListVO);
               itemSelectPageListVO.setItemGroupName(maps.get(user.getItemGroupId()));
                return itemSelectPageListVO;
            }).collect(Collectors.toList());
    }



}
