package com.naker.web.controller;

import com.naker.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jeremy
 * @date 2020/8/15
 */

@RestController
@RequestMapping("/hello")
public class TestController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "test")
    public String test() {
        String s = "surprise, motherfucker!";
        return helloService.sayHello(s);
    }


}
