package com.shxp.harbor.service.impl;

import com.shxp.harbor.dao.SysUserDAO;
import com.shxp.harbor.dao.UserDAO;
import com.shxp.harbor.exception.HarborException;
import com.shxp.harbor.po.SysUser;
import com.shxp.harbor.po.SysUserExample;
import com.shxp.harbor.po.User;
import com.shxp.harbor.po.UserExample;
import com.shxp.harbor.query.InsertUserListQuery;
import com.shxp.harbor.query.LoginQuery;
import com.shxp.harbor.query.UserListQuery;
import com.shxp.harbor.response.ResponseEnum;
import com.shxp.harbor.service.UserService;
import com.shxp.harbor.vo.InsertUserListVO;
import com.shxp.harbor.vo.UserListVO;
import com.shxp.harbor.vo.UserLoginVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserLoginVO login(LoginQuery loginQuery) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAcountEqualTo(loginQuery.getUsername())
                .andPasswordEqualTo(loginQuery.getPassword());
        List<User> sysUsers = userDAO.selectByExample(userExample);
        if (sysUsers.size() == 0) {
            throw new HarborException(ResponseEnum.AUTH_ACCOUNT_INVALID, "密码错误");
        }
        UserLoginVO userLoginVO = new UserLoginVO();
        BeanUtils.copyProperties(sysUsers.get(0), userLoginVO);
        return userLoginVO;
    }

    @Override
    public List<UserListVO> getUsers(UserListQuery userListQuery) {
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        List<User> users = userDAO.selectByExample(userExample);

        return users.stream().map(user -> {
            UserListVO userListVO = new UserListVO();
            BeanUtils.copyProperties(user, userListVO);
            return userListVO;
        }).collect(Collectors.toList());
    }

    @Override
    public Integer insertUser(InsertUserListQuery insertuserListQuery) {
        User user = new User();
        BeanUtils.copyProperties(insertuserListQuery, user);
        Integer insertUser = userDAO.insertSelective(user);
        return insertUser;
    }
}
