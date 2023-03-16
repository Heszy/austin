package com.hszy.austin.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @RequestMapping("/test")
    private String test(){
        System.out.println("sout打印信息");
        log.info("使用log打印日志");
        return("日志");
    }
}