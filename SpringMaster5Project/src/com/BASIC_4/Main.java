package com.BASIC_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext (MyConfig.class);
		Employee e = ctx.getBean(Employee.class);
//		System.out.println((new Address()).toString());
		System.out.println(e.toString());
		
	}
}
