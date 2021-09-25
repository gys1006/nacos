package com.nacos.test;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class provideController {


    @Value("${db.host}")
//    @NacosValue(value = "${db.host:test}", autoRefreshed = true)    通过这种方式可以获取到数据 但是不能进行赋值 TODO
    private String useLocalCache;

   /* public void setUseLocalCache(String useLocalCache) {
        this.useLocalCache = useLocalCache;
    }*/
    @GetMapping("provideTest")
    @ResponseBody
    public String get(){
        System.out.println(useLocalCache);
        return "provideTest |" + useLocalCache;
    }
}
