package com.example.controller;

import com.example.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
    @GetMapping
    public  String home(Model model){
        model.addAttribute("email",new Email());
        List<String> languages =new ArrayList<>();
        languages.add("english");
        languages.add("vietnamese");
        languages.add("chines");
        languages.add("japanese");
        model.addAttribute("languages",languages);
        List<String> pageSize=new ArrayList<>();
        pageSize.add("12");
        pageSize.add("20");
        pageSize.add("25");
        pageSize.add("100");
        model.addAttribute("pageSize",pageSize);
        return "/home";
    }
    @PostMapping("update")
    public String update(Model model, @ModelAttribute Email email){
        Email email1 = email;
        model.addAttribute("language",email.getLanguages());
        model.addAttribute("pageSize",email.getPageSize());
        model.addAttribute("spamsFilter",email.getSpam());
        model.addAttribute("sign",email.getSignature());
        model.addAttribute("email1",email1);
        return "/index";
    }
}
