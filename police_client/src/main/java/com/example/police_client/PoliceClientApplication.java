package com.example.police_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PoliceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoliceClientApplication.class, args);
    }

}
