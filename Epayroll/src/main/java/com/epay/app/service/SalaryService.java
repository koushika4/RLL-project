package com.epay.app.service;

import java.util.Optional;

import com.epay.app.modal.Leaves;
import com.epay.app.modal.Salary;

public interface SalaryService {

	Iterable<Salary> getSalary();

	Boolean saveSalary(Salary salary);

	Boolean deleteSalary(int id);

	Optional<Salary> getSalarySalaryById(int id);

	Boolean updateSalary(Salary salary);

}