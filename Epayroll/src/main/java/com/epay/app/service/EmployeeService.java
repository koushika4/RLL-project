package com.epay.app.service;

import java.util.List;
import java.util.Optional;

import com.epay.app.modal.Employee;

public interface EmployeeService {

	List<Employee> getEmployee();

	Boolean saveEmployee(Employee employee);

	Boolean deleteEmployee(Long id);

	Optional<Employee> getEmployeeById(Long id);

	Employee updateEmployeeById(Employee employee);

}