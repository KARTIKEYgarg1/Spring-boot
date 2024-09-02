package com.ust.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Emp {
	@Value("${id}")
	int id;
	@Value("${name}")
	String name;
	
	@Autowired
	Address ad;
	public Emp() {
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

	public Address getAdd() {
		return this.ad;
	}

	public void setAdd(Address add) {
		this.ad = add;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", ad=" + ad.city +" " + ad.pin +"]";
	}

	
}
