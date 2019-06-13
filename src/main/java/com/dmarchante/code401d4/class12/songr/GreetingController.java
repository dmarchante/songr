package com.dmarchante.code401d4.class12.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Autowired
    GreetingRepository greetingRepository;

    @GetMapping("/greetings")
    public String getAllGreetings(Model m) {
        Iterable<Greeting> greetings = greetingRepository.findAll();
        m.addAttribute("greetings", greetings);
        return "allGreetings";
    }
}
