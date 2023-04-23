package com.shxp.harbor.service;

import com.shxp.harbor.query.LoginQuery;
import com.shxp.harbor.query.UserListQuery;
import com.shxp.harbor.vo.UserListVO;
import com.shxp.harbor.vo.UserLoginVO;

import java.util.List;

public interface UserService {
    UserLoginVO login(LoginQuery loginQuery);

    List<UserListVO> getUsers(UserListQuery userListQuery);
}
