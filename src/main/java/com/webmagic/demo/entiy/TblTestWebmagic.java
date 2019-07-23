package com.webmagic.demo.entiy;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.ExtractByUrl;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * @author hankai
 * @version 1.0
 * @date 2019/7/23 15:59
 */
@Data
@HelpUrl("http://www.yangmaoduo.com/page_\\d+.html")
@TargetUrl("http://www.yangmaoduo.com/\\d+.html")
public class TblTestWebmagic implements Serializable {
    private BigDecimal id;

    @ExtractByUrl
    private String url;

    @ExtractBy("//*[@id=\"title\"]/h1/text()")
    private String title;

    private String createTime;

    @ExtractBy("//*[@id=\"zi\"]/text()")
    private String articleText;

    @ExtractBy("//*[@id=\"zi\"]/p[12]/text()")
    private String articleLabel;

    private String version;

    private static final long serialVersionUID = 1L;
}