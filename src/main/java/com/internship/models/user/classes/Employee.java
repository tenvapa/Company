package com.internship.models.user.classes;


import com.internship.models.department.Department;
import com.internship.models.job.Job;
import com.internship.models.user.interfaces.User;

public class Employee implements User {

    private String name;
    private String age;
    private String mail;

    private Job job;

    @Override
    public Job getJob() {
        return job;
    }

    @Override
    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
