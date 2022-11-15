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
import com.epay.app.modal.WorkSchedule;
import com.epay.app.service.EmployeeService;
import com.epay.app.service.LeavesService;
import com.epay.app.service.WorkScheduleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("leaves")
public class LeavesController {
	@Autowired
	LeavesService leavesService;

	@GetMapping(value = "")
	public Iterable<Leaves> getAllLeaves() {
		return leavesService.getLeaves();

	}

	@PutMapping(value = "/{status}/{id}")
	public Boolean onAction(@PathVariable("status") String status, @PathVariable("id") int id) {
		return leavesService.actionLeave(status,id);
	}


}