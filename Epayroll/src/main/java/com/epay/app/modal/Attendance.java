package com.epay.app.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int empId;
	private String email;
	private String attendanceDate;
	private String Status;

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(int id, int empId, String email, String attendanceDate, String status) {
		super();
		this.id = id;
		this.empId = empId;
		this.email = email;
		this.attendanceDate = attendanceDate;
		Status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", empId=" + empId + ", email=" + email + ", attendanceDate=" + attendanceDate
				+ ", Status=" + Status + "]";
	}

}