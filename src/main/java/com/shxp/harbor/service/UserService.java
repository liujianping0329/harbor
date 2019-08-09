package com.shxp.harbor.service;

import com.shxp.harbor.query.LoginQuery;
import com.shxp.harbor.vo.UserLoginVO;

public interface UserService {
    UserLoginVO login(LoginQuery loginQuery);

}
