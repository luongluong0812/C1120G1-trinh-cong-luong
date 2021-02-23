package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("")
    public String home() {
        return "/index";
    }

    @GetMapping("/select")
    public String select(@RequestParam(required = false) String vegetable, Model model) {
        List<String> list=new ArrayList<>();
        list.add(vegetable);
        model.addAttribute("result",list);
        return "/result";
    }
}
