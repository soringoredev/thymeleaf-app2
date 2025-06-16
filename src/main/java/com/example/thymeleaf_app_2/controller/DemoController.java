package com.example.thymeleaf_app_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    //
    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        int number = 23;
        //int number2 = null;
        String text = "Noroc";
        String text2 = null;

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloworld";
    }
}
