package com.example.hellomessagingapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String sayhello(){
        return "Hello From BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
