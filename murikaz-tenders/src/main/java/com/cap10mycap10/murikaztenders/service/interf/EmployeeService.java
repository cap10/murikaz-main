package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.gmat.tenders.exception.ResourceNotFoundException;
import com.cap10mycap10.gmat.tenders.pojo.EmployeePojo;
import com.cap10mycap10.gmat.tenders.proj.EmployeeView;

import java.util.Collection;

public interface EmployeeService {
    void createEmployee(EmployeePojo employeePojo);

    void updateEmployee(Long id, EmployeePojo employeePojo) throws ResourceNotFoundException;

    void deleteEmployee(Long id) throws ResourceNotFoundException;

    Collection<EmployeeView> getEmployees();
}
