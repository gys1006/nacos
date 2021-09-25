package com.nacos.feign;

import com.nacos.ProvideApi;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProvideApiImpl implements ProvideApi {

    @Override
    public String provideApi() {
        return "provideApiImpl";
    }
}
