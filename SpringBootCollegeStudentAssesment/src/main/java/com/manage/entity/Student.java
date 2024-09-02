package com.manage.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private long id;
	private String name;
	private String courseTaken;
	private int marks;

    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private College college;
    public Student() {
    	
    }
	public Student(long id, String name,String courseTaken,int marks) {
		this.id = id;
		this.name = name;
		this.courseTaken=courseTaken;
		this.marks=marks;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
