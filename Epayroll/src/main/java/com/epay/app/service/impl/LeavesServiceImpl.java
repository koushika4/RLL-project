package com.epay.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.app.modal.Leaves;
import com.epay.app.modal.WorkSchedule;
import com.epay.app.repository.LeavesRepository;
import com.epay.app.service.LeavesService;

@Service
public class LeavesServiceImpl implements LeavesService {

	@Autowired
	LeavesRepository leavesRepository;

	@Override
	public Iterable<Leaves> getLeaves() {
		return leavesRepository.findAll();
	}

	@Override
	public Boolean actionLeave(String status, int id) {
		Leaves leave = new Leaves();
		leave.setId(id);
		leave.setStatus(status);
		leavesRepository.actionLeaveById(status, id);
		return null;
	}

}