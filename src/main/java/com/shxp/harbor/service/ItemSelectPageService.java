package com.shxp.harbor.service;

import com.shxp.harbor.query.*;
import com.shxp.harbor.vo.ItemGroupListVO;
import com.shxp.harbor.vo.ItemSelectPageListVO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ItemSelectPageService {


    List<ItemSelectPageListVO> getItemGroup(ItemSelectPageListQuery itemSelectPageListQuery);
}
