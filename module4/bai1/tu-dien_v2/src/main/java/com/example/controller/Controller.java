package com.example.controller;


import com.example.repository.Word;
import com.example.repository.WordIPLM;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    private Word wordInput=new WordIPLM();
    @GetMapping("")
    public String home(){
        return "/home";
    }
    @GetMapping("/search")
    public String search(@RequestParam String word, Model model){
        String res=wordInput.result(word);
        model.addAttribute("result",res);
        return "/result";
    }
}
