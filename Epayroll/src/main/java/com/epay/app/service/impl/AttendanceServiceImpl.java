package com.epay.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.app.modal.Attendance;
import com.epay.app.repository.AttendanceRepository;
import com.epay.app.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceRepository attendanceRepository;

	@Override
	public Boolean saveAttendance(Attendance attandance) {
		if (attendanceRepository.existsByEmailAndAttendanceDate(attandance.getEmail(),
				attandance.getAttendanceDate())) {
			return false;

		} else {
			attendanceRepository.save(attandance);
			return true;
		}
	}

	@Override
	public Iterable<Attendance> getAttendance() {
		return attendanceRepository.findAll();
	}

	@Override
	public Boolean deleteAttendence(int id) {
		attendanceRepository.deleteById(id);
		return true;
	}

}