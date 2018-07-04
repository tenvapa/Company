package com.internship.controller;

import com.internship.models.user.classes.Employee;
import com.internship.models.user.interfaces.User;
import com.internship.models.user.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private UserService service;

    @GetMapping("/home")
    public String getHomePage(){
        return "user-credentials";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String writeUser(Employee user){
        this.service.writeUserIntoDB(user);
        return "redirect:/showAll";
    }





}
