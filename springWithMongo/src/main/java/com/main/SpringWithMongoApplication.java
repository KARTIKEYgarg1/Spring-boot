package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.main.service.EmployeeService;

@SpringBootApplication
public class SpringWithMongoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringWithMongoApplication.class, args);
		EmployeeService bs=ctx.getBean(EmployeeService.class);
	}

}
