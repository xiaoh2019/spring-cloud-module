package com.cyzs.concumerfeign.controller;

import com.cyzs.concumerfeign.service.Hiservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoH
 * @create 2019-05-13-12:37
 */
@RestController
public class HelloController {
    @Autowired
    Hiservice hiservice;

    @GetMapping("hello")
    public String hello(String name){
        String s = hiservice.sayHiFromClientOne(name);
        return s;
    }
}
