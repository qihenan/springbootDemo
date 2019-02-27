package com.qihenan.demo;


import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloTwo")
    public String sayHello(){
        return new Date().toString();
    }

}
