package com.shxp.harbor.service;


import com.shxp.harbor.query.LogManageListQuery;
import com.shxp.harbor.vo.LogManageListVO;

import java.util.List;

public interface LogManageService {

    List<LogManageListVO>  getLogManageGroup(LogManageListQuery logManageListQuery);
}
