package com.dmarchante.code401d4.class12.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// not rest
// Thymeleaf, our view engine will try to handle what we return form these methods
// Thymeleaf expects the string we return to be the name of a template

@Controller
public class NotARestController {

    @GetMapping("/notresthello")
    public String getNotRestHello(Model m) {
        // this means that THymeleaf
        String[] allTheNames = new String[] {"David", "Stephen", "Robert", "Will", "Cristian"};

        m.addAttribute("names", allTheNames);
        return "hello";
    }
}
