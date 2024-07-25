package com.ead.decodeprojectapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DecodeProjectApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecodeProjectApiGatewayApplication.class, args);
    }

}
