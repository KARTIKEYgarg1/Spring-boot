package com.ust.bean;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
	private int empid;
	@JsonFormat(pattern = "dd-MMM-YYYY")
	private LocalDate d;
	private String name;

	public Employee(int empid, LocalDate d, String name) {
		super();
		this.empid = empid;
		this.d = d;
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public LocalDate getD() {
		return d;
	}

	public void setD(LocalDate d) {
		this.d = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
