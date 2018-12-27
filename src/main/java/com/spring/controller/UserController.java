package com.spring.controller;

import com.spring.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class UserController {
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String addUser(Users users,ModelMap modelMap){
        modelMap.addAttribute("name","weiwei");
        return "adduser";
    }
}
