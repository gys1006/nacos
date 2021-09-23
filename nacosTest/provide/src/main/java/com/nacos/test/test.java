package com.nacos.test;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {


    @Value("${db.host:host}")
    private String useLocalCache;

   /* public void setUseLocalCache(String useLocalCache) {
        this.useLocalCache = useLocalCache;
    }*/
    @GetMapping("test")
    @ResponseBody
    public String get(){
        System.out.println(useLocalCache);
        return "provideNacos";
    }
}
