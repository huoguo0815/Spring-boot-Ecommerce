package com.example.shopping.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    public String viewSellPage(Model model){
        model.addAttribute("Product","新增");
        model.addAttribute("Product", new ProuductModel());
        return "test";
    }

    @PostMapping("/test")
    public String NewProuduct(ProuductModel Product){
        productService.addProduct(Product);
        return "redirect:"+"http://localhost:8080/test";
    }

}
