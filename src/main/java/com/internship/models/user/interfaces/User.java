package com.internship.models.user.interfaces;

import com.internship.models.department.Department;
import com.internship.models.job.Job;

public interface User {

    String getName();
    void setName(String name);

    String getAge();
    void setAge(String age);

    String getMail();
    void setMail(String mail);


    Job getJob();
    void setJob(Job job);







}
