package com.cap10mycap10.murikaztenders.proj;

import com.cap10mycap10.murikaztenders.model.Employee;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Employee.class)
public interface EmployeeView {


    String getName();

    String getSurname();

    String email();
}
