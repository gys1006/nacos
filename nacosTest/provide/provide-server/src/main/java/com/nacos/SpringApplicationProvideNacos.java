package com.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringApplicationProvideNacos {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationProvideNacos.class, args);
    }
}
