package com.manage.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	private long collegeId;
	private String name;

	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Student> s;
	public College() {
	
	}
	public College(long collegeId, String name) {
		this.collegeId = collegeId;
		this.name = name;
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getS() {
		return s;
	}

	public void setS(List<Student> s) {
		this.s = s;
	}
}
