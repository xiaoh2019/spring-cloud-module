package com.cyzs.concumerribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaoH
 * @create 2019-05-13-11:56
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @GetMapping("/hello")
    public String hello(String name){
        String s = restTemplate.getForObject("http://EUREKA-HI/hi?name=" + name, String.class);
        return s;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
