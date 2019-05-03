package com.example.people_caller.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
public class PeopleController {

    public static final Logger LOGGER = LoggerFactory.getLogger(PeopleController.class);

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(name = "call")
    public  String call () {
        LOGGER.info("people呼叫警察!!!");
        return getRestTemplate().getForObject("http://police/call",String.class);
    }
}
