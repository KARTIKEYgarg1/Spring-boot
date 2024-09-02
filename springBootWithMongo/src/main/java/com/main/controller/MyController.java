package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.Employee;
import com.main.service.EmployeeService;

@RestController
public class MyController {
	@Autowired
	private EmployeeService serv;

	@GetMapping("/")
	public List<Employee> all() {
		return serv.getAll();
	}
	@GetMapping("/get/{id}")
	public Employee get(@PathVariable int id) {
		return serv.getEmpById(id);
	}
	@GetMapping("/getName/{name}/{email}")
	public List<Employee> get(@PathVariable String name,@PathVariable String email) {
		return serv.getEmpByName(name,email);
	}
	@PostMapping("/add")
	public void add(@RequestBody Employee emp) {
		serv.add(emp);
		return;
	}
	@DeleteMapping("/del/{id}")
	public String del(@PathVariable int id) {
		return serv.deleteEmp(id);
	}
	@PutMapping("/update")
	public String del(@RequestBody Employee emp) {
		return serv.updateEmp(emp);
	}
}
