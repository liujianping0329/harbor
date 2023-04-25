package com.shxp.harbor.service.impl;


import com.shxp.harbor.dao.LogDAO;
import com.shxp.harbor.po.Log;
import com.shxp.harbor.po.LogExample;
import com.shxp.harbor.query.LogManageListQuery;
import com.shxp.harbor.service.LogManageService;
import com.shxp.harbor.vo.LogManageListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogManageServiceImpl implements LogManageService {

    @Autowired
    private LogDAO logDAO;

       @Override
    public List<LogManageListVO>getLogManageGroup(LogManageListQuery logManageListQuery) {
           LogExample logExample=new LogExample();
            logExample.createCriteria();
            List<Log> logManage = logDAO.selectByExample(logExample);

            return logManage.stream().map(user->{
                LogManageListVO logManageListVO=new LogManageListVO();
                BeanUtils.copyProperties(user,logManageListVO);
                return logManageListVO;
        }).collect(Collectors.toList());
    }


}
