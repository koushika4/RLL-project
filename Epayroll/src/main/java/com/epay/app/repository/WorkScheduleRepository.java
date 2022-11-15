package com.epay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epay.app.modal.WorkSchedule;

@Repository
public interface WorkScheduleRepository extends CrudRepository<WorkSchedule, Integer> {

}