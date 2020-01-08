package com.shxp.harbor.service;

import com.shxp.harbor.po.VisitHis;
import com.shxp.harbor.query.LoginQuery;
import com.shxp.harbor.query.VisitHisQuery;
import com.shxp.harbor.vo.UserLoginVO;

public interface VisitHisService {
    Integer addHis(VisitHisQuery visitHisQuery);

}
