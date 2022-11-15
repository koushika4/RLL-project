package com.epay.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epay.app.modal.Employee;
import com.epay.app.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("employee")
public class EmployeeController {
@Autowired
EmployeeService employeeService;

@GetMapping(value="")
public List<Employee> getAllEmployees(){
	return employeeService.getEmployee();
	
}

@PostMapping(value="")
public Boolean saveEmployee(@RequestBody Employee employee) {
	return employeeService.saveEmployee(employee);
}

@DeleteMapping(value="{id}")
public Boolean deleteEmployee(@PathVariable("id") Long id) {
	return employeeService.deleteEmployee(id);
}

@GetMapping(value="{id}")
public Optional<Employee> getEmployeeById(@PathVariable("id") Long id) {
	return employeeService.getEmployeeById(id);
}

@PutMapping(name="")
public Employee updateEmployeeById(@RequestBody Employee employee) {
	return employeeService.updateEmployeeById(employee);
}


}