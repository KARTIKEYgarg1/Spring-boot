package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.main.service.CustomerService;

@SpringBootApplication
public class FullSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(FullSpringBootApplication.class, args);
		CustomerService bs=ctx.getBean(CustomerService.class);
	}

}
