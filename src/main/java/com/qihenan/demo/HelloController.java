package com.qihenan.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloTwo")
    public String sayHello(){
        return "helloT23456789wo!!!!!!!!!";
    }

}
