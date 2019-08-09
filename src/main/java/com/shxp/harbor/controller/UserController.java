package com.shxp.harbor.controller;

import com.shxp.harbor.query.LoginQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.UserService;
import com.shxp.harbor.vo.UserLoginVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "登陆", tags = "基本接口")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<UserLoginVO> login(@RequestBody LoginQuery loginQuery) {
        UserLoginVO login = userService.login(loginQuery);
        request.getSession().setAttribute("userInfo",login);
        return new BaseResponse<>(login);
    }



}
