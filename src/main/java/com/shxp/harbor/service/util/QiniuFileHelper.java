package com.shxp.harbor.service.util;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

@Component
public class QiniuFileHelper {

    @Value("${qiniu.ak:}")
    public String accessKey;
    @Value("${qiniu.sk:}")
    public String secretKey;
    @Value("${qiniu.bucket:}")
    public String bucket;
    @Value("${qiniu.domain:}")
    public String domain;


    @SneakyThrows
    public String upload(InputStream is) {
        UploadManager uploadManager = new UploadManager(new Configuration(Zone.zone0()));
        String key = null;
        String upToken = Auth.create(this.accessKey, this.secretKey).uploadToken(this.bucket);
        Response response = uploadManager.put(is, key, upToken, null, null);
        String hash = JSONObject.parseObject(response.bodyString(), DefaultPutRet.class).hash;
        return "http://" + this.domain + "/" + hash;
    }

}
