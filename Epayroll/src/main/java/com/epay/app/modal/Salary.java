package com.epay.app.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int empId;
	@Column(unique = true)
	private String email;
	private String salary;

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(int id, int empId, String email, String salary) {
		super();
		this.id = id;
		this.empId = empId;
		this.email = email;
		this.salary = salary;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", empId=" + empId + ", email=" + email + ", salary=" + salary + "]";
	}

}