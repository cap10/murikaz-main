package com.cap10mycap10.murikaztenders.repository;

import com.cap10mycap10.gmat.tenders.model.Employee;
import com.cap10mycap10.gmat.tenders.proj.EmployeeView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Collection<EmployeeView> findAllBy();
}
