package com.hszy.austin.web;

import com.alibaba.fastjson.JSON;
import com.hszy.austin.support.dao.MessageTemplateDao;
import com.hszy.austin.support.domain.MessageTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private MessageTemplateDao messageTemplateDao;
    @RequestMapping("/test")
    private String test(){
        System.out.println("sout打印信息");
        log.info("使用log打印日志");
        return("hello");
    }

    @RequestMapping("/database")
    private String testDataBase(){
        List<MessageTemplate> list = messageTemplateDao.findAllByIsDeletedEquals(0, PageRequest.of(0,10));
        return JSON.toJSONString(list);
    }
}