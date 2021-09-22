package nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringApplicationConsumeNacos {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationConsumeNacos.class, args);
    }
}
