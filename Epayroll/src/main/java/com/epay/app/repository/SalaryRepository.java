package com.epay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epay.app.modal.Salary;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, Integer> {

	boolean existsByEmail(String email);

}