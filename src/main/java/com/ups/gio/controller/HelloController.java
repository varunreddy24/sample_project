package com.ups.gio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

//    @RequestMapping("/hello")
//    public String sayHi() {
//        return "Hi";
//    }

    @RequestMapping("/hello")
    public String sayHi(Model model) {
        model.addAttribute("hi", "Hello there Varun from controller");
        return "hello";
    }
}
