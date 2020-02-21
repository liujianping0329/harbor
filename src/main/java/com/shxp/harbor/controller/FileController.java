package com.shxp.harbor.controller;

import com.shxp.harbor.response.BaseResponse;
import com.shxp.harbor.service.util.QiniuFileHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Api(value = "FileController", tags = "文件接口")
@Controller
@RequestMapping("/api/file")
@ResponseBody
public class FileController {
    @Resource
    HttpServletRequest request;
    @Resource
    HttpServletResponse response;

    @Autowired
    private QiniuFileHelper qiniuFileHelper;


    @ApiOperation(value = "上传文件到七牛云")
    @RequestMapping(value = "/upload/qiniu", method = RequestMethod.POST)
    @SneakyThrows
    public BaseResponse<String> uploadQiniu(@RequestParam("file") MultipartFile file) {
        return new BaseResponse(this.qiniuFileHelper.upload(file.getInputStream()));
    }
}
