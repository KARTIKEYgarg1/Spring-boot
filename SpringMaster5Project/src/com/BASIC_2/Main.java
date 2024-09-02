package com.BASIC_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee e = (Employee) ctx.getBean("Employee");
		System.out.println(e.toString());
	}
}
