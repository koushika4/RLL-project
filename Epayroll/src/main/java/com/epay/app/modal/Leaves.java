package com.epay.app.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "leaves")
public class Leaves {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int empId;
	private String email;
	private String leaveFrom;
	private String leaveTo;
	private String reason;
	private String status;

	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leaves(int id, int empId, String email, String leaveFrom, String leaveTo, String reason, String status) {
		super();
		this.id = id;
		this.empId = empId;
		this.email = email;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.reason = reason;
		this.status = status;
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

	public String getLeaveFrom() {
		return leaveFrom;
	}

	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	public String getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Leaves [id=" + id + ", empId=" + empId + ", email=" + email + ", leaveFrom=" + leaveFrom + ", leaveTo="
				+ leaveTo + ", reason=" + reason + ", status=" + status + "]";
	}

}