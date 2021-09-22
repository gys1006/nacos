package com.nacos.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("test")
    @ResponseBody
    public String get(){
        return "provideNacos";
    }
}
