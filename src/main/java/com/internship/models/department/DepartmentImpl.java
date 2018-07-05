package com.internship.models.department;

public class DepartmentImpl implements Department {
    private String department;

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }
}
