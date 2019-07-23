package com.webmagic.demo.service;

import com.webmagic.demo.entiy.TblTestWebmagic;
import com.webmagic.demo.mapper.TblTestWebmagicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

/**
 * @author hankai
 * @version 1.0
 * @date 2019/7/23 14:05
 */
@Component(value = "WebmagicPipeline")
public class WebmagicPipeline implements PageModelPipeline<TblTestWebmagic> {

    @Autowired
    TblTestWebmagicMapper webmagicMapper;

    @Override
    public void process(TblTestWebmagic tblTestWebmagic, Task task) {
        webmagicMapper.insert(tblTestWebmagic);
    }
}
