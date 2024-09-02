package com.BASIC_1;

public class Student {
	int id;String name;int marks;
	Student(){
	}
	public void setter(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String displayScore() {
		return name+" "+marks;
	}
}
