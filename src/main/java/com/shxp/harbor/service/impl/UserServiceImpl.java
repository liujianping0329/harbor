package com.shxp.harbor.service.impl;

import com.shxp.harbor.dao.SysUserDAO;
import com.shxp.harbor.exception.HarborException;
import com.shxp.harbor.po.SysUser;
import com.shxp.harbor.po.SysUserExample;
import com.shxp.harbor.query.LoginQuery;
import com.shxp.harbor.response.ResponseEnum;
import com.shxp.harbor.service.UserService;
import com.shxp.harbor.vo.UserLoginVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserDAO sysUserDAO;

    @Override
    public UserLoginVO login(LoginQuery loginQuery) {
        SysUserExample sysUserExample=new SysUserExample();
        sysUserExample.createCriteria().andUsernameEqualTo(loginQuery.getUsername())
            .andPasswordEqualTo(loginQuery.getPassword());
        List<SysUser> sysUsers = sysUserDAO.selectByExample(sysUserExample);
        if (sysUsers.size()==0){
            throw new HarborException(ResponseEnum.AUTH_ACCOUNT_INVALID,"密码错误");
        }
        UserLoginVO userLoginVO=new UserLoginVO();
        BeanUtils.copyProperties(sysUsers.get(0),userLoginVO);
        return userLoginVO;
    }
}
