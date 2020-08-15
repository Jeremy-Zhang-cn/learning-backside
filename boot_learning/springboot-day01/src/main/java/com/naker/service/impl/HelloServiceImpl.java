package com.naker.service.impl;

import com.naker.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author Jeremy
 * @date 2020/8/15
 */
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String s) {
        return "sentence: " + s;
    }

}
