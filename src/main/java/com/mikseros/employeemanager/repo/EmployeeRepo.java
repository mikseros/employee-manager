package com.mikseros.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikseros.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
}
