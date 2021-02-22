package com.example.controller;

import com.example.service.ChangeService;
import com.example.service.ChangeServiceIplm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangerController {
    private ChangeService changeService=new ChangeServiceIplm();
    @GetMapping("")
    public String home(){
        return "/index";
    }
    @GetMapping("/change")
    public String change(@RequestParam String number1, @RequestParam String number2, Model model){
        int result=changeService.change(Integer.parseInt(number1),Integer.parseInt(number2));
        model.addAttribute("result",result);
        return "/result";
    }
}
