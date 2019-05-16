package com.cyzs.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoH
 * @create 2019-05-13-11:34
 */
@RestController
public class HiController {


    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "wang") String name){


        return "hi " + name + " ,i am from port:" + port;
    }
}
