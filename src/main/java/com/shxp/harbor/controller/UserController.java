package com.shxp.harbor.controller;

import com.shxp.harbor.query.InsertUserListQuery;
import com.shxp.harbor.query.LoginQuery;
import com.shxp.harbor.query.UserListQuery;
import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.UserService;
import com.shxp.harbor.vo.InsertUserListVO;
import com.shxp.harbor.vo.UserListVO;
import com.shxp.harbor.vo.UserLoginVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "login", tags = "login接口")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<UserLoginVO> login(@RequestBody LoginQuery loginQuery) {
        UserLoginVO login = userService.login(loginQuery);
        request.getSession().setAttribute("userInfo",login);
        return new BaseResponse<>(login);
    }

    @ApiOperation(value = "getUsers", tags = "getUsers")
    @RequestMapping(value = "/getUsers", method = RequestMethod.POST)
    public BaseResponse<List<UserListVO>> getUsers(@RequestBody UserListQuery userListQuery) {
        List<UserListVO> userListVOS = userService.getUsers(userListQuery);
        return new BaseResponse<>(userListVOS);
    }


    @ApiOperation(value = "insertUser", tags = "insertUser")
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public BaseResponse<Integer> insertUser(@RequestBody InsertUserListQuery insertuserListQuery) {
        Integer insertUser = userService.insertUser(insertuserListQuery);
        return new BaseResponse<>(insertUser);
    }
}
