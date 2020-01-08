package com.shxp.harbor.service.impl;

import com.shxp.harbor.dao.VisitHisDAO;
import com.shxp.harbor.po.VisitHis;
import com.shxp.harbor.query.VisitHisQuery;
import com.shxp.harbor.service.VisitHisService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitHisServiceImpl implements VisitHisService {

    @Autowired
    private VisitHisDAO visitHisDAO;

    @Override
    public Integer addHis(VisitHisQuery visitHisQuery) {
        VisitHis visitHis=new VisitHis();
        BeanUtils.copyProperties(visitHisQuery,visitHis);
        visitHisDAO.insertSelective(visitHis);
        return visitHis.getId();
    }
}
