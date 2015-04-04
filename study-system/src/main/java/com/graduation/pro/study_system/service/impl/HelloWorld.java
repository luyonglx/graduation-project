package com.graduation.pro.study_system.service.impl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/")
public class HelloWorld {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
     
}
