package com.shxp.harbor.po;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Log implements Serializable {
    private Integer id;

    private String itemId;

    /**
     * 入庫0
出庫1
     */
    private Integer type;

    private Integer number;

    private String date;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}