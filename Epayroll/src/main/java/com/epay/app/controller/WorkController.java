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
import com.epay.app.modal.WorkSchedule;
import com.epay.app.service.EmployeeService;
import com.epay.app.service.WorkScheduleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("work")
public class WorkController {
	@Autowired
	WorkScheduleService workScheduleService;

	@GetMapping(value = "")
	public List<WorkSchedule> getAllSchedule() {
		return workScheduleService.getWorkSchedule();

	}

	@PostMapping(value = "")
	public Boolean saveWork(@RequestBody WorkSchedule workSchedule) {
		return workScheduleService.saveWork(workSchedule);
	}

	@DeleteMapping(value = "{id}")
	public Boolean deleteEmployee(@PathVariable("id") int id) {
		return workScheduleService.deleteWork(id);
	}
	
	@GetMapping(value="{id}")
	public Optional<WorkSchedule> getWorkById(@PathVariable("id") int id) {
		return workScheduleService.getworkById(id);
	}
	
	@PutMapping(value="")
	public Boolean updateWork(@RequestBody WorkSchedule workSchedule) {
		return workScheduleService.updateWork(workSchedule);
		
	}



}