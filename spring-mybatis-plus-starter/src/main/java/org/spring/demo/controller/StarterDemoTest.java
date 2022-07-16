package org.spring.demo.controller;

import org.spring.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuibaoqiang
 * @date 2022-07-16 16:20:04
 * @desc
 */
@RestController
public class StarterDemoTest {

    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello(String userName) {
        return helloService.sayHello(userName);
    }
}
