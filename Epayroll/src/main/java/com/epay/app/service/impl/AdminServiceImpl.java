package com.epay.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.app.modal.Admin;
import com.epay.app.repository.AdminRepository;
import com.epay.app.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public boolean login(Admin admin) {
		return adminRepository.existsByEmailAndPassword(admin.getEmail(), admin.getPassword());
	}

}