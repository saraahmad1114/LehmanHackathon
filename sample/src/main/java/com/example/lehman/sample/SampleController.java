package com.example.lehman.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private String greeting = "Hello my name is ";

    @RequestMapping("/hello")
    public String helloWorld(@RequestParam String  message){
        return greeting + message;
    }
}
