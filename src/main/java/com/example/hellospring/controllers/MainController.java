package com.example.hellospring.controllers;

import com.example.hellospring.services.CalculateDayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private final CalculateDayOfWeek dayOfWeek = new CalculateDayOfWeek();

    @GetMapping("/what's up")
    public String whatsUp() {
        return "What's up?";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String text){
        return text;
    }

    @GetMapping("/ErDetFredag")
    public String erDetFredag() {
        return dayOfWeek.calculateDayOfWeek();
    }
}
