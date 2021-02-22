package com.example.controller;

import com.example.service.SumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    private SumService sumService;
    @GetMapping({"","/sum2num"})
    public String sum2number(@RequestParam String number1, @RequestParam String number2, Model model){
        int a=Integer.parseInt(number1);
        int b=Integer.parseInt(number2);
        int result=sumService.sum2num(a,b);
        model.addAttribute("result",result);
        return "/result";
    }

}
