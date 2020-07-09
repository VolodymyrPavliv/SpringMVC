package com.mushroom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") double a,
                             @RequestParam("b") double b,
                             @RequestParam("action") String action,
                             Model model) {
        switch (action) {
            case "multiplication": model.addAttribute("result", a * b);
            break;
            case "addition": model.addAttribute("result", a + b);
            break;
            case "subtraction": model.addAttribute("result", a - b);
            break;
            case "division": model.addAttribute("result", a / b);
        }

        return "first/calculator";
    }

}
