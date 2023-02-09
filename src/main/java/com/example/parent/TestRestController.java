package com.example.parent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/hello")
    public String testHello(){
        return "Welcome to REST";
    }

}
