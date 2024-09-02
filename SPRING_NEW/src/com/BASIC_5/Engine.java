package com.BASIC_5;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Engine {
	private String size;
	private String type;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
