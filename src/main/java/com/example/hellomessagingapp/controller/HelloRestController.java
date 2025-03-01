package com.example.hellomessagingapp.controller;
import com.example.hellomessagingapp.dto.UserDTO;
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

    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
