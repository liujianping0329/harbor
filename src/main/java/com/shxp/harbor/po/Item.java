package com.shxp.harbor.po;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Item implements Serializable {
    private Integer id;

    private Integer itemGroupId;

    private String name;

    private String number;

    private String sannti;

    private String itemcol;

    private static final long serialVersionUID = 1L;
}