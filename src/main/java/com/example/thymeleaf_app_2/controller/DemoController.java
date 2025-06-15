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
        return  "helloworld";
    }




    //
     //

    // primitive: byte, short, int, long, float, double, boolean, char
    // Non-primitive: String, Arrays, Clase

    // 100

    byte variabilaUnu   = 100; // -128 pana la 127
    short variabilaDoi  = 100; // -32 K
    int variabilaTrei   = 100;
    long variabilaPatru = 100;

    //char - //  '5'     '4'  '{'  'c'   'D'   '_'   '6'











}
