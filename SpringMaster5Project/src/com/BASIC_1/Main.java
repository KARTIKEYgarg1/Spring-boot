package com.BASIC_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
//	Student s=new Student();s.setter(1,"KARTIKEY",78);
//	System.out.print(s.displayScore());
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student) ctx.getBean("student");
		s.setter(1, "KART", 45);
		System.out.println(s.displayScore());
	}
}
