package com.example.first_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainPage {
    
    @GetMapping("/index")
    public String index(){
        return "index"; // templates/index.html
    }

    @GetMapping("/about_cosmetic")
    public String aboutCosmetic(){
        return "about_cosmetic"; // templates/about_cosmetic.html
    }

    @GetMapping("/product_sku01")
    public String productSku01(){   
        return "product_sku01"; // templates/product_sku01.html
    }
}
