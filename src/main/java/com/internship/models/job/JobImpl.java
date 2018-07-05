package com.internship.models.job;


import com.internship.models.department.Department;
import com.internship.models.job.Job;

public class JobImpl implements Job {
    private Department departmentName;
    private String jobPosition;
    private String salary;

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public String getSalary() {
        return salary;
    }

    @Override
    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String getContractLength() {
        return contractLength;
    }

    @Override
    public void setContractLength(String contractLength) {
        this.contractLength = contractLength;
    }

    private String contractLength;

    @Override
    public void setDepartmentName(Department departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public Department getDepartmentName() {
        return this.departmentName;
    }

}
