package com.shxp.harbor.query;

import com.shxp.harbor.po.News;
import lombok.Data;

@Data
public class NewsQuery {
    private Integer id;
    private Integer valid;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 图片
     */
    private String pics;
}
