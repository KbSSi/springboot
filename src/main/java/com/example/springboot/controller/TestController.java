package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author KangWenBin
 * @description http client测试
 * @date 2023/8/5
 */


@RestController
@RequestMapping("/api")
public class TestController {
    @RequestMapping("/getCode")
    public String getCode() throws Exception{
        return "hello world111";
//        for (String code:codes) {
//            System.out.println(code);
//        }
    }

    @RequestMapping("/testPost")
    public String testPost(String name){
        return ("hello1" + name);
    }
}
