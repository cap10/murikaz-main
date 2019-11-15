package com.cap10mycap10.murikaztenders.service.impl;

import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.model.Employee;
import com.cap10mycap10.gmat.tenders.pojo.EmployeePojo;
import com.cap10mycap10.gmat.tenders.proj.EmployeeView;
import com.cap10mycap10.gmat.tenders.repository.EmployeeRepository;
import com.cap10mycap10.gmat.tenders.service.interf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(EmployeePojo employeePojo) {
        Employee employee = new Employee();
        employee.setName(employeePojo.getName());
        employee.setSurname((employeePojo.getSurname()));
        employee.setCreatedDate(new Date());
        employee.setCreatedBy(employeePojo.getCreatedBy());
        employee.setLastModifiedBy(employeePojo.getLastModifiedBy());
        employee.setLastModifiedDate(new Date());
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Long id, EmployeePojo employeePojo) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found on::" + id));
        employee.setSurname(employeePojo.getSurname());
        employee.setName(employeePojo.getName());
        employee.setEmail(employeePojo.getEmail());
        employee.setLastModifiedBy(employeePojo.getLastModifiedBy());
        employee.setLastModifiedDate(new Date());
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found on::" + id));
        employeeRepository.delete(employee);
    }

    @Override
    public Collection<EmployeeView> getEmployees() {
        return employeeRepository.findAllBy();
    }
}
