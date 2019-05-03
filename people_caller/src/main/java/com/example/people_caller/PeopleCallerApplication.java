package com.example.people_caller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PeopleCallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleCallerApplication.class, args);
    }

}
