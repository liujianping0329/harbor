package com.shxp.harbor.service;

import com.github.pagehelper.PageInfo;
import com.shxp.harbor.query.HotImeiListQuery;
import com.shxp.harbor.vo.HotImeiListVO;

public interface HotImeiService {
    PageInfo<HotImeiListVO> listHotImei(HotImeiListQuery hotImeiListQuery);
}
