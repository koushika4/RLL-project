package com.epay.app.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.boot.registry.classloading.spi.ClassLoaderService.Work;
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
import com.epay.app.modal.Leaves;
import com.epay.app.modal.Salary;
import com.epay.app.modal.WorkSchedule;
import com.epay.app.repository.SalaryRepository;
import com.epay.app.service.EmployeeService;
import com.epay.app.service.LeavesService;
import com.epay.app.service.SalaryService;
import com.epay.app.service.WorkScheduleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("salary")
public class SalaryController {
	@Autowired
	SalaryService salaryService;

	@GetMapping(value = "")
	public Iterable<Salary> getAllSalary() {
		return salaryService.getSalary();

	}
	
	@PostMapping(value = "")
	public Boolean saveSalary(@RequestBody Salary salary) {
		return salaryService.saveSalary(salary);
	}
	@DeleteMapping(value="{id}")
	public Boolean deleteEmployee(@PathVariable("id") int id) {
		return salaryService.deleteSalary(id);
	}
	@GetMapping(value="{id}")
	public Optional<Salary> getEmployeeById(@PathVariable("id") int id) {
		return salaryService.getSalarySalaryById(id);
	}
	@PutMapping(value="")
	public Boolean updateSalary(@RequestBody Salary salary) {
		return salaryService.updateSalary(salary);
	}



}