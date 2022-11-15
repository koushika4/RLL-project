package com.epay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epay.app.modal.Attendance;
@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Integer> {

	boolean existsByEmailAndAttendanceDate(String email, String attendanceDate);

}