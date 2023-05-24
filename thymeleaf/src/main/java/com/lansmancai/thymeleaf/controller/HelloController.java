package com.lansmancai.thymeleaf.controller;

import com.lansmancai.thymeleaf.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index(ModelMap map) {
        map.addAttribute("name", "Hello Thymeleaf From Spring Boot");
        return "hello";
    }

    @RequestMapping("/if")
    public String ifunless(ModelMap map) {
        map.addAttribute("flag", "yes");
        return "if";
    }

    @RequestMapping("/switch")
    public String switchcase(ModelMap map) {
        map.addAttribute("status", "doing");
        return "switch";
    }

    @RequestMapping("/list")
    public String list(ModelMap map) {
        List<UserModel> list=new ArrayList();
        UserModel user1=new UserModel("spring",12,"123456");
        UserModel user2=new UserModel("boot",6,"123456");
        UserModel user3=new UserModel("Thymeleaf",66,"123456");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        map.addAttribute("users", list);
        return "list";
    }

    @RequestMapping("/inline")
    public String inline(ModelMap map) {
        map.addAttribute("fontSize", "20px");
        map.addAttribute("color", "yellow");
        map.addAttribute("userName", "admin");

        return "inline";
    }

    @RequestMapping("/i18n")
    public String i18n() {
        return "i18n";
    }


    @RequestMapping("/object")
    public String test1(HttpServletRequest request){
        request.setAttribute("request", "spring boot");
        request.getSession().setAttribute("session", "admin session");
        request.getServletContext().setAttribute("servletContext","Thymeleaf servletContext");
        return "baseobject";
    }


    @RequestMapping("/insert")
    public String insert() {
        return "insert";
    }

    @RequestMapping("/layout")
    public String layout() {
        return "layout";
    }

    @RequestMapping("/layout/index")
    public String index() {
        return "layout/index";
    }
}
