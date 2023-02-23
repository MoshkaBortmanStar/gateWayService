package com.example.gatewayexamplechello.controller;


import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/engineer")
public class MainController {


    @GetMapping("/say")
    public String sayHello(@RequestHeader Map<String, String> headers ) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header '%s' = %s", key, value));
        });

        return "Hello Engineer";
    }


}
