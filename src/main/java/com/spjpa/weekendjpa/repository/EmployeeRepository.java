package com.spjpa.weekendjpa.repository;

import com.spjpa.weekendjpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
