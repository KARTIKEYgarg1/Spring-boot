package com.BASIC_4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {
	@Value("${eid}")
	int id;
	@Value("${name}")
	String name;
	@Value("${sal}")
	int sal;
	@Autowired
	Address add;
	public Employee(){
		super();
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
	public void setAdd(Address add) {
		this.add = add;
	}
	public Address getAdd() {
		return add;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + sal + ", address=" + add.city+" "+add.code  + "]";
	}
}
