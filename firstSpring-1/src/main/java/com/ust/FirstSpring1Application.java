package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.service.StudentService;

//@SpringBootApplication
public class FirstSpring1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstSpring1Application.class, args);
		StudentService s = ctx.getBean(StudentService.class);
		boolean createNew = true;
		Student t = new Student(5, 35, "SW");
		if (createNew) {
			s.saveUser(new Student(1, 10, "KA"));
			s.saveUser(new Student(2, 15, "TA"));
			s.saveUser(new Student(3, 20, "KY"));
			s.saveUser(new Student(4, 25, "KA"));
			s.saveUser(t);
		}
		System.out.println("ALL STUDENTS:");
		System.out.println(s.getAll());
		System.out.println("KA STUDENT:");
		System.out.println(s.getStudByName("KA"));
		System.out.println("ID=5 :");
		System.out.println(s.getStudById(5));
		System.out.println("UPDATE USER WITH ID=5:");
		t.setMark(1);
		System.out.println(s.updateUser(5, t).toString());
		System.out.println("DELETE USER ID=5:");
		System.out.println(s.deleteUser(5));
	}
}
