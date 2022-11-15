package com.epay.app.service;

import com.epay.app.modal.Attendance;

public interface AttendanceService {

	Boolean saveAttendance(Attendance attandance);

	Iterable<Attendance> getAttendance();

	Boolean deleteAttendence(int id);

}