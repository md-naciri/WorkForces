package com.workforces.workforces.services;

import com.workforces.workforces.entities.Employee;

public class EmployeeService {
    private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void showEmployee(){
        System.out.println(employee);
    }

    public void addEmployee(){

    }
}
