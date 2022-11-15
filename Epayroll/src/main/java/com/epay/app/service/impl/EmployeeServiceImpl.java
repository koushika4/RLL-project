package com.epay.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.app.modal.Employee;
import com.epay.app.repository.EmployeeRepository;
import com.epay.app.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Boolean saveEmployee(Employee employee) {
		if (employeeRepository.existsByEmailOrPhone(employee.getEmail(), employee.getPhone())) {
			return false;
		} else {
			employeeRepository.save(employee);
			return true;
		}
	}

	@Override
	public Boolean deleteEmployee(Long id) {
		if (employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public Employee updateEmployeeById(Employee employee) {
		return employeeRepository.save(employee);
	}



}