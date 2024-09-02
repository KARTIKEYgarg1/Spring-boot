package com.BASIC_5;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Type {
	private String cartype;
	private String time;
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
