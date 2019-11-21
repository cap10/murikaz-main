package com.cap10mycap10.murikaztenders.service.interf;

import com.cap10mycap10.murikaztenders.exception.ResourceNotFoundException;
import com.cap10mycap10.murikaztenders.pojo.EmployeePojo;
import com.cap10mycap10.murikaztenders.proj.EmployeeView;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.Collection;

public interface EmployeeService {

    @CachePut(value="tenderscache", key="#result.id")
    void createEmployee(EmployeePojo employeePojo);

    @Cacheable
    void updateEmployee(Long id, EmployeePojo employeePojo) throws ResourceNotFoundException;

    void deleteEmployee(Long id) throws ResourceNotFoundException;

    @Cacheable
    Collection<EmployeeView> getEmployees();
}
