package com.workforces.workforces.services;

import com.workforces.workforces.entities.Employee;
import com.workforces.workforces.repositories.EmployeeRepository;

public class EmployeeService {
    /*private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void showEmployee(){
        System.out.println(employee);
    }*/
    private EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }


}
