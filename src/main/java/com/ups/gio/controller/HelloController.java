package com.ups.gio.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping("/hello")
//    public String sayHi() {
//        return "Hi";
//    }

    @RequestMapping("/hello")
    public String sayHi(Model model) {
        model.addAttribute("hi", "Hello");
        return "hi";
    }
}
