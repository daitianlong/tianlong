package com.example.consulting_platform_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ConsultingPlatformServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsultingPlatformServerApplication.class, args);
    }

}
