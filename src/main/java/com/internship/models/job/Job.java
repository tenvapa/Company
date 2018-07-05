package com.internship.models.job;


import com.internship.models.department.Department;

public interface Job {
    void setDepartmentName(Department departmentName);
    Department getDepartmentName();

    void setJobPosition(String jobPosition);
    String getJobPosition();

    void setSalary(String salary);
    String getSalary();

    String getContractLength();
    void setContractLength(String contractLength);
}
