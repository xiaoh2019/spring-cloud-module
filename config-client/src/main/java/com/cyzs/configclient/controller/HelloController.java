package com.cyzs.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoH
 * @create 2019-05-13-17:00
 */
@RestController
public class HelloController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String hi(){
        return foo;
    }
}
