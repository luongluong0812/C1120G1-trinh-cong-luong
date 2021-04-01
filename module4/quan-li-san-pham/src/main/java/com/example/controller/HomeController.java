package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductIplm;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HomeController {
private ProductService productService=new ProductIplm();
@GetMapping("")
    public String goHome(Model model){
    List<Product> productList=productService.finAll();
    model.addAttribute("list",productList);
    return "index";


}
@GetMapping("/product/{id}/edit")
    public String doEdit(@PathVariable  int id, Model model){
    Product product=productService.findById(id);
    model.addAttribute("productSearch",product);
    return "edit";
}

}
