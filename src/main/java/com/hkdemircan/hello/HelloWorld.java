package com.hkdemircan.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/display")
    public String getMessage(){
        return "Hello World with Docker";
    }
}
