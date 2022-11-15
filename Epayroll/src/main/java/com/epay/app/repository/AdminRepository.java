package com.epay.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.epay.app.modal.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

	boolean existsByEmailAndPassword(String email, String password);

}