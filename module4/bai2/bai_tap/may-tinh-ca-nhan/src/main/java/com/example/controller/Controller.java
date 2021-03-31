package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("")
    public String home(){
        return "/home";
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam String number1, @RequestParam String number2, @RequestParam String cal, Model model){
        int result = 0;
        if(cal.equals("cong")){
             result=Integer.parseInt(number1)+Integer.parseInt(number2);
        }
        if(cal.equals("tru")){
            result=Integer.parseInt(number1)-Integer.parseInt(number2);
        }
        if(cal.equals("nhan")){
            result=Integer.parseInt(number1)*Integer.parseInt(number2);
        }
        if(cal.equals("chia")){
            result=Integer.parseInt(number1)/Integer.parseInt(number2);
        }
        model.addAttribute("result",result);
        return "/home";
    }
}
