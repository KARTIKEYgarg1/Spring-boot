package com.BASIC_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
//	Engine e=new Engine();
//	Type t=new Type();
//	e.setSize("BIG");
//	e.setType("ELECTRIC");
//	t.setCartype("MODERN");
//	t.setTime("OLD");
//	Car c=new Car(e,t,"Maruti");
//	System.out.println(c.toString());
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	Car c=(Car)ctx.getBean("car");
	System.out.println(c.toString());
	}
}
