package com.example.EYCD24072024.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraEYCDController {

    @GetMapping("/restaEYCD")
    public String showSumForm(Model model) {
        model.addAttribute("num1", 0);
        model.addAttribute("num2", 0);
        model.addAttribute("result", 0);
        return "calculadora/restaEYCD";
    }

    @PostMapping("/restaEYCD")
    public String performSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 - num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "calculadora/restaEYCD";
    }

}
