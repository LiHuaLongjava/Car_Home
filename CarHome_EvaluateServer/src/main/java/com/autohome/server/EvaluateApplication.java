package com.autohome.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.autohome.server.dao")
public class EvaluateApplication {
        public static void main(String[] args) {
            SpringApplication.run(EvaluateApplication.class,args);
        }
}
