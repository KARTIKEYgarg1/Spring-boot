package com.ust;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	private int id;
	private int mark;
	@Column(name="NAME")
	private String name;
	public int getId() {
		return id;
	}
	public Student(int id, int mark, String name) {
		this.id = id;
		this.mark = mark;
		this.name = name;
	}
	public Student() {
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", mark=" + mark + ", name=" + name + "]";
	}
}
