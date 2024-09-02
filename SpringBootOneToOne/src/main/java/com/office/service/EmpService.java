package com.office.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.entity.Employee;
import com.office.repo.DeskRepo;
import com.office.repo.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo empRepo;
	@Autowired
	private DeskRepo deskRepo;
	
	public Employee createEmp(Employee e) {
		return empRepo.save(e);
	}
	
}

