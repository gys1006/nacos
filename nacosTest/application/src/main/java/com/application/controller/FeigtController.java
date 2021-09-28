package com.application.controller;

import com.nacos.ProvideApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeigtController {


    @Reference(retries = 3,check = false)
    ProvideApi provideApi;

    @GetMapping("feigtTest")
    @ResponseBody
    public String get(){
        String s = provideApi.provideApi();
        return s;

    }
}
