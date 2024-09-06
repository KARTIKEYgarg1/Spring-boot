package com.office.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Desk {
	@Id
	public int deskno;
	@Column(name="dept")
	public String department;
	
	public Desk(int deskno,String dep) {
		this.deskno=deskno;
		this.department=dep;
	}
	
	public Desk() {
		
	}
	public int getDeskNo() {return deskno;}
	public String getDepartment() {return department;}
	
	public void setDeskNo(int deskno) {this.deskno=deskno;}
	public void setDepartment(String department) {this.department=department;}
}
