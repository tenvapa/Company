package com.internship.models.job;


import com.internship.models.department.Department;

public interface Job {
    void setDepartmentName(Department departmentName);
    Department getDepartmentName();

    void setName(String jobPosition);
    String getName();

    void setSalary(String salary);
    String getSalary();

    String getContractLength();
    void setContractLength(String contractLength);
}
