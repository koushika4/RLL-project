package com.epay.app.service;

import java.util.List;
import java.util.Optional;

import com.epay.app.modal.WorkSchedule;

public interface WorkScheduleService {

	List<WorkSchedule> getWorkSchedule();

	Boolean saveWork(WorkSchedule workSchedule);

	Boolean deleteWork(int id);

	Optional<WorkSchedule> getworkById(int id);

Boolean updateWork(WorkSchedule workSchedule);

}