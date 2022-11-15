package com.epay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epay.app.modal.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	boolean existsByEmail(String email);

	boolean existsByEmailAndPhone(String email, String phone);

	boolean existsByEmailOrPhone(String email, String phone);

}