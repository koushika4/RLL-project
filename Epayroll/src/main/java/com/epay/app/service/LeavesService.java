package com.epay.app.service;

import java.util.List;

import com.epay.app.modal.Leaves;
import com.epay.app.modal.WorkSchedule;

public interface LeavesService {

	Iterable<Leaves> getLeaves();



	Boolean actionLeave(String status, int id);

}