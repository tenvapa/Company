package com.internship.controller;

import com.internship.models.user.classes.Employee;
import com.internship.models.user.interfaces.User;
import com.internship.models.user.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("showAll")
    public String showUsers(Model model){

        List<User> users = service.getAllUsers();


        if (!users.isEmpty()){
                model.addAttribute("users", users);
                return "user-view";
            }
        else {
            return "redirect:/home";
        }

    }

    @GetMapping("showAll/delete/{name}")
    public String deleteUser(@PathVariable String name){
        User user = this.service.getUserByName(name);

        if(user!=null){
            this.service.deleteUser(user);
            return "redirect:/showAll";
         }
        else
            return "redirect:/home";
    }

    @GetMapping("edit/{name}")
    public String showEditUserView(@PathVariable String name, Model model){

        User user = this.service.getUserByName(name);
        model.addAttribute("user" , user);
        return "user-edit";

    }

    @PostMapping("edit/{name}")
    public String editUser(@PathVariable String name, Employee newUser,  Model model){
        User user = this.service.getUserByName(name);
        this.service.editUser(user, newUser);

        return "redirect:/showAll";

    }
}

