package com.office.entity;

import jakarta.persistence.Id;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	public int eid;
	
	public String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="assigned_desk")
	public List<Desk> desk;
	
public Employee(int eid,String name,List<Desk> desk) {
		this.eid=eid;
		this.name=name;
		this.desk=desk;
	}

	public Employee() {
		
	}
	
	public String getName() {return name;}
	public int getEid() {return eid;}
	public List<Desk> getDesk() {return desk;}
	
	public void setName(String name) {this.name=name;}
	public void setEid(int eid) {this.eid=eid;}
	public void setDesk(List<Desk> desk) {this.desk=desk;}
	
}
