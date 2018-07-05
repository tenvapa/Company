package com.internship.controller;

import com.internship.models.department.Department;
import com.internship.models.department.DepartmentImpl;
import com.internship.models.job.Job;
import com.internship.models.job.JobImpl;
import com.internship.models.user.classes.Employee;
import com.internship.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private UserService service;

    @GetMapping("/home")
    public String getHomePage(){
        return "user-credentials";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)

    public String writeUser(Employee user, JobImpl job, DepartmentImpl department){
        job.setDepartmentName(department);
        user.setJob(job);
        this.service.writeUserIntoDB(user);
        return "redirect:/showAll";
    }




}
