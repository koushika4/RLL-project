package com.epay.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epay.app.modal.Admin;
import com.epay.app.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping(value="login")
	public ResponseEntity<Boolean> login(@RequestBody Admin admin){
		if(adminService.login(admin)) {
	        return ResponseEntity.status(HttpStatus.OK).body(true);
		}
		else {
	        return ResponseEntity.status(HttpStatus.OK).body(false);
		}
	}

}