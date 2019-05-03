package com.example.police_client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoliceController {

    @RequestMapping(name = "call")
    public  String call () {
        return "call the police";
    }

}
