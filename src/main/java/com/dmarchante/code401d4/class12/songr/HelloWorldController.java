package com.dmarchante.code401d4.class12.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// mark this class as a controller, so that SpringBoot knows to look at it

@RestController
public class HelloWorldController {

    //specify route for method
    @GetMapping("/hello")
    public String getHelloWord() {
        return "Hello world!";
    }

    @GetMapping("/capitalize/{str}")
    public String getStringCapitalize(@PathVariable String str) {
        return str.toUpperCase();
    }

    // https://www.baeldung.com/spring-request-param
    @GetMapping("/reverse")
    public String getSentenceOptional(@RequestParam(required = false) String sentence) {
        // https://www.geeksforgeeks.org/reverse-words-given-string-java/

        String[] words = sentence.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }
        return reversedString;
    }
}
