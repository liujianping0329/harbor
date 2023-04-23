package com.shxp.harbor.po;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String acount;

    private String password;

    /**
     * 超管用戶0
普通用戶1
     */
    private Integer userType;

    private static final long serialVersionUID = 1L;
}