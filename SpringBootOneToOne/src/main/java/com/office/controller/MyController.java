package com.office.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.office.entity.Employee;
import com.office.service.EmpService;

@RestController
public class MyController {
	
	@Autowired
	private EmpService serv;
	
	@GetMapping("/")
	public String get() {
		return "Hi";
	}
	
	@PostMapping("/")
	public Employee get(@RequestBody Employee e) {
		return serv.createEmp(e);
	}
	
}
