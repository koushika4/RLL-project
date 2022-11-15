package com.epay.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epay.app.modal.Leaves;
import com.epay.app.modal.Salary;
import com.epay.app.repository.SalaryRepository;
import com.epay.app.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public Iterable<Salary> getSalary() {
		return salaryRepository.findAll();

	}

	@Override
	public Boolean saveSalary(Salary salary) {
		if (salaryRepository.existsByEmail(salary.getEmail())) {
			return false;
		} else {
			salaryRepository.save(salary);

			return true;
		}
	}

	@Override
	public Boolean deleteSalary(int id) {
		salaryRepository.deleteById(id);
		return true;
	}

	@Override
	public Optional<Salary> getSalarySalaryById(int id) {
		// TODO Auto-generated method stub
		return salaryRepository.findById(id);
	}

	@Override
	public Boolean updateSalary(Salary salary) {

		salaryRepository.save(salary);
		return true;
	}
}