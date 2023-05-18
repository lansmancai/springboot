package com.lansmancai.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello2Controller {

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        return "Hello2 lansmancai2@ Spring Boot!!!";
    }
}
