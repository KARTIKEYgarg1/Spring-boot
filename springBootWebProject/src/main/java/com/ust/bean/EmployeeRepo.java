package com.ust.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
	private List<Employee> e;

public EmployeeRepo() {
	e=new ArrayList<Employee>();
	e.add(new Employee(100,LocalDate.of(2000, 1,3),"S"));
	e.add(new Employee(101,LocalDate.of(2000, 1,1),"S1"));
	e.add(new Employee(102,LocalDate.of(2000, 1,2),"S2"));
	e.add(new Employee(103,LocalDate.of(2000, 1,6),"S3"));
	e.add(new Employee(104,LocalDate.of(2000, 1,5),"S4"));
}

	public List<Employee> getE() {
		return e;
	}

	public void setE(List<Employee> e) {
		this.e = e;
	}
}
