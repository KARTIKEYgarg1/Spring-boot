package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.bean.Emp;
import com.ust.bean.HelloWorld;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(FirstSpringApplication.class, args);
//		HelloWorld h = ctx.getBean(HelloWorld.class);
		Emp e=ctx.getBean(Emp.class);
		System.out.println(e.toString());
	}

}
