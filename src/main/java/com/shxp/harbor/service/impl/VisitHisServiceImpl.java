package com.shxp.harbor.service.impl;

import com.shxp.harbor.dao.VisitHisDAO;
import com.shxp.harbor.po.VisitHis;
import com.shxp.harbor.po.VisitHisExample;
import com.shxp.harbor.query.VisitHisQuery;
import com.shxp.harbor.service.VisitHisService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VisitHisServiceImpl implements VisitHisService {

    @Autowired
    private VisitHisDAO visitHisDAO;

    @Override
    public Integer addHis(VisitHisQuery visitHisQuery) {
        VisitHis visitHis=new VisitHis();
        BeanUtils.copyProperties(visitHisQuery,visitHis);
        VisitHisExample visitHisExample=new VisitHisExample();
        visitHisExample.createCriteria().andCipEqualTo(visitHis.getCip());
        List<VisitHis> visitHisList = visitHisDAO.selectByExample(visitHisExample);
        if(visitHisList.size()!=0){
            VisitHis visitHisUpdate=new VisitHis();
            visitHisUpdate.setId(visitHisList.get(0).getId());
            visitHisUpdate.setMtime(new Date());
            visitHisDAO.updateByPrimaryKeySelective(visitHisUpdate);
        }else{
            visitHisDAO.insertSelective(visitHis);
        }
        return visitHis.getId();
    }
}
