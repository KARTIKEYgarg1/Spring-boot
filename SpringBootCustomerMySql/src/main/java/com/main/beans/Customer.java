package com.main.beans;

import java.time.LocalDate;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	private int id;
	private String name;
	private String branch;
	private double amount;
//	@DateTimeFormat(pattern = "DD-MMM-YYYY")
	private String createdOn;
	public Customer() {
		
	}
	public Customer(int id, String name, String branch, double amount, String createdOn) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.amount = amount;
		this.createdOn = createdOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", branch=" + branch + ", amount=" + amount + ", createdOn="
				+ createdOn + "]";
	}

}
