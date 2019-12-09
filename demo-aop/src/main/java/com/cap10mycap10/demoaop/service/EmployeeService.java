package com.cap10mycap10.demoaop.service;

import com.cap10mycap10.demoaop.pojo.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private Employee employee;

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee e){
        this.employee=e;
    }
}
