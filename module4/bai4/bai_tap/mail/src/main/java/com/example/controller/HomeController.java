package com.example.controller;

import com.example.model.Mail;
import org.graalvm.compiler.hotspot.aarch64.AArch64HotSpotRegisterAllocationConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("")
    public ModelAndView goHome(Model model) {
        List<String> listLanguages = new ArrayList<>();
        List<Integer> listPageSize = new ArrayList<>();
        List<String> listSpam = new ArrayList<>();
        listLanguages.add("anh");
        listLanguages.add("viet");
        listLanguages.add("nhat");
        listLanguages.add("trung");
        listPageSize.add(5);
        listPageSize.add(10);
        listPageSize.add(15);
        listPageSize.add(20);
        model.addAttribute("languages", listLanguages);
        model.addAttribute("pageSize", listPageSize);
        model.addAttribute("listSpam", listSpam);
        return new ModelAndView("home", "send", new Mail());

    }

    @PostMapping("update")
    public ModelAndView show(@ModelAttribute Mail mail) {
        return new ModelAndView("show", "mail", mail);

    }

}
