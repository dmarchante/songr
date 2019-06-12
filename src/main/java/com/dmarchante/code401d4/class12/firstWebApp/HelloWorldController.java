package com.dmarchante.code401d4.class12.firstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// mark this class as a controller, so that SpringBoot knows to look at it

@RestController
public class HelloWorldController {

    //specify route for method
    @GetMapping("/")
    public String getHelloWord() {
        return "Hello world!";
    }

    @GetMapping("/hello/{name}")
    public String getHelloName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
