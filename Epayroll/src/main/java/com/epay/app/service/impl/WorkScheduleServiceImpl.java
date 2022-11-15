package com.epay.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.app.modal.WorkSchedule;
import com.epay.app.repository.WorkScheduleRepository;
import com.epay.app.service.WorkScheduleService;
@Service
public class WorkScheduleServiceImpl implements WorkScheduleService {

	@Autowired
	WorkScheduleRepository workScheduleRepository;

	@Override
	public List<WorkSchedule> getWorkSchedule() {
		return (List<WorkSchedule>) workScheduleRepository.findAll();
	}

	@Override
	public Boolean saveWork(WorkSchedule workSchedule) {
		workScheduleRepository.save(workSchedule);
		return true;

	}

	@Override
	public Boolean deleteWork(int id) {
		workScheduleRepository.deleteById(id);
		return true;
	}

	@Override
	public Optional<WorkSchedule> getworkById(int id) {
	return 	workScheduleRepository.findById(id);
	}

	@Override
	public Boolean updateWork(WorkSchedule workSchedule) {
		workScheduleRepository.save(workSchedule);
		return true;

	}




}
