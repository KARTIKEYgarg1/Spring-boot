package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Employee;
import com.main.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public String add(Employee emp) {
		repo.save(emp);
		return "Success";
	}

	public List<Employee> getAll() {
		return repo.findAll();
	}

	public Employee getEmpById(int id) {
		Optional<Employee> e = repo.findById(id);
		if (e.isPresent())
			return e.get();
		else
			return null;
	}


	public List<Employee> getEmpByName(String name,String email){
		List<Employee> e = repo.findByNameAndEmail(name,email);
		if (e.size()>0)
			return e;
		else
			return null;
	}

	public String deleteEmp(int id) {
		Employee e = getEmpById(id);
		if (e != null) {
			repo.deleteById(id);
			return "deleted";
		} else
			return null;
	}
	public String updateEmp(Employee e) {
		Employee t = getEmpById(e.getId());
		if (t != null) {
			repo.save(e);
			return "updated";
		} else
			return null;
	}
}
