package com.webmagic.demo.controller;

import com.webmagic.demo.entiy.TblTestWebmagic;
import com.webmagic.demo.service.WebmagicPipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.model.OOSpider;


/**
 * @author hankai
 * @version 1.0
 * @date 2019/7/23 12:30
 */
@RestController
@RequestMapping("/webmagic")
public class WebmagicController {

    @Autowired
    private WebmagicPipeline webmagicPipeline;

    Spider thread;

    @GetMapping("/start")
    public String start() {
        thread = OOSpider.create(Site.me().setSleepTime(1000)
                , webmagicPipeline, TblTestWebmagic.class)
                .addUrl("http://www.yangmaoduo.com").thread(5);
        thread.start();
        return "正在爬取";
    }

    @GetMapping("/stop")
    public String stop() {
        thread.stop();
        return "停止爬取";
    }
}
