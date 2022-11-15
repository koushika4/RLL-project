package com.epay.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epay.app.modal.Leaves;


@Repository
public interface LeavesRepository extends CrudRepository<Leaves, Integer> {
	@Modifying
	@Transactional
	@Query(value="update leaves L set L.status = ?1 where L.id = ?2",nativeQuery = true)
	void actionLeaveById(String status, int id);

}