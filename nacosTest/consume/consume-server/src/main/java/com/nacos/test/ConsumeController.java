package com.nacos.test;


import com.nacos.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class ConsumeController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    @Value("${db.host}")
//    @NacosValue(value = "${db.host:test}", autoRefreshed = true)    通过这种方式可以获取到数据 但是不能进行赋值 TODO
    private String useLocalCache;

    @Autowired
    private ConsumerFeign consumerFeign;

    @GetMapping("/consumeTest")
    @ResponseBody
    public String get() {
       /* List<ServiceInstance> list = discoveryClient.getInstances("provide");
        ServiceInstance instance = list.get(0);
        String host = instance.getHost();
        int port = instance.getPort();

        String url = "http://" + host + ":" + port + "/test";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        String body = responseEntity.getBody();*/


        String feignTest = consumerFeign.get();
        return "feignTest |" + feignTest + "" + useLocalCache;
    }
}
