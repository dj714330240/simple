package com.tiny.cases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 声明他是一个客户端，注册中心暴露
 */
@EnableEurekaClient
@SpringBootApplication
public class CasesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasesApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

}
