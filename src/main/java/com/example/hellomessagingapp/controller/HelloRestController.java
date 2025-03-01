package com.example.hellomessagingapp.controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/hello/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
