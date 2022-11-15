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

import com.epay.app.modal.Attendance;
import com.epay.app.modal.Employee;
import com.epay.app.modal.WorkSchedule;
import com.epay.app.service.AttendanceService;
import com.epay.app.service.EmployeeService;
import com.epay.app.service.WorkScheduleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("attandance")
public class AttandanceController {
	@Autowired
	AttendanceService attendanceService;

@GetMapping(value="")
public Iterable<Attendance> getAttandance(){
	return attendanceService.getAttendance();
	
}

	@PostMapping(value = "")
	public Boolean saveAttandance(@RequestBody Attendance attandance) {
		return attendanceService.saveAttendance(attandance);
	}

	@DeleteMapping(value="{id}")
	public Boolean deleteAttandance(@PathVariable("id") int id) {
		return attendanceService.deleteAttendence(id);
	}
	

}