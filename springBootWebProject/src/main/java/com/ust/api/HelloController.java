package com.ust.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bean.Employee;
import com.ust.bean.EmployeeRepo;

@RestController
public class HelloController {

	@Autowired
	private EmployeeRepo er;
	@GetMapping("ust")
	public Employee Hello() {
		return new Employee(0,LocalDate.of(2002,11,3),"KART");
	}

	@GetMapping("all")
	public List<Employee> getA() {
		return er.getE();
	}
	
}
