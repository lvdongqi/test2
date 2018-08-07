package com.jk.controller;

import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 吕东崎
 * @Title: TestController
 * @ProjectName springboot-consumer
 * @Description: TODO
 * @date 2018/8/716:17
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String home(){
        return testService.sayHello();
    }

}
