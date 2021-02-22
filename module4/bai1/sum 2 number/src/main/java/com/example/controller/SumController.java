package com.example.controller;

import com.example.service.SumService;
import com.example.service.SumServiceIPLM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    private SumService sumService=new SumServiceIPLM();
    @GetMapping("/sum2number")
    public String home(@RequestParam String number1, @RequestParam String number2, Model model){
        int result=Integer.parseInt(number1)+Integer.parseInt(number2);
        model.addAttribute("kq",result);
        return "/result";
    }
    @GetMapping("")
    public String home(){
        return "/home";
    }
}
