package com.shxp.harbor.service;

import com.shxp.harbor.query.*;
import com.shxp.harbor.vo.ItemGroupListVO;

import java.util.List;

public interface ItemGroupService {

    List<ItemGroupListVO>  getItemGroup(ItemGroupListQuery itemGroupListQuery);

    Integer deleteItemGroup(ItemGroupDeleteQuery itemGroupDeleteQuery);

    Integer insertItemGroup(ItemGroupInsertQuery itemGroupInsertQuery);

    Integer updateItemGroup(ItemGroupUpdateQuery itemGroupUpdateQuery);
}
