package com.epay.app.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workschedule")
public class WorkSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int empId;
	private String email;
	private String workTitle;
	private String workDescription;
	private String status;
	private String startDate;
	private String endDate;

	public WorkSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkSchedule(int id, int empId, String email, String workTitle, String workDescription, String status,
			String startDate, String endDate) {
		super();
		this.id = id;
		this.empId = empId;
		this.email = email;
		this.workTitle = workTitle;
		this.workDescription = workDescription;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
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

	public String getWorkTitle() {
		return workTitle;
	}

	public void setWorkTitle(String workTitle) {
		this.workTitle = workTitle;
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "WorkSchedule [id=" + id + ", empId=" + empId + ", email=" + email + ", workTitle=" + workTitle
				+ ", workDescription=" + workDescription + ", status=" + status + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

}