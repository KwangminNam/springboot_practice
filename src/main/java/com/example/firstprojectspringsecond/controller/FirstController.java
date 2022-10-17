package com.example.firstprojectspringsecond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String niceToMeetYOu(Model model){
        model.addAttribute("username","kwangmin");
        return "greetings";
    }

    @GetMapping("/bye")
    public String sayBye(Model model){
        model.addAttribute("nickname","byename");
        return "bye";
    }

}
