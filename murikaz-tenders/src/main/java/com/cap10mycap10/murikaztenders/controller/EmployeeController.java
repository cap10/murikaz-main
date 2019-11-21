package com.cap10mycap10.murikaztenders.controller;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.EmployeePojo;
import com.cap10mycap10.murikaztenders.service.interf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;


@RestController("/api/v1/employees")

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employee")
    @PreAuthorize(("hasAuthority('EMPLOYEE_VIEW')"))
    public ResponseEntity<Object> getEmployee() {
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @PutMapping(value = "/employee/{id}")
    @PreAuthorize(("hasAuthority('EMPLOYEE_UPDATE')"))
    public ResponseEntity<Object> updateEmployee(@PathVariable("id") Long id, @RequestBody EmployeePojo employeePojo) throws ResourceNotFoundException {
        employeeService.updateEmployee(id, employeePojo);
        return new ResponseEntity<>("Employee updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/employee/{id}")
    @PreAuthorize(("hasAuthority('EMPLOYEE_DELETE')"))
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/employee")
    @PreAuthorize(("hasAuthority('EMPLOYEE_ADD')"))
    public ResponseEntity<Object> createEmployee(@RequestBody EmployeePojo employeePojo) {
        employeeService.createEmployee(employeePojo);
        return new ResponseEntity<>("Employee created successfully", HttpStatus.CREATED);
    }


}
