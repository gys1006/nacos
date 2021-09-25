package com.nacos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "provide")
public interface ConsumerFeign {

    @GetMapping("/provideTest")
    String get();
}
