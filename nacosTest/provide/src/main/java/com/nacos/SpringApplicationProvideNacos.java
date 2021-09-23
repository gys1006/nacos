package com.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationProvideNacos {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationProvideNacos.class, args);
    }
}
