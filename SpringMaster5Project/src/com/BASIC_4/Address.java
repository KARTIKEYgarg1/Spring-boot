package com.BASIC_4;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {
	@Value("${city}")
	String city;
	@Value("${code}")
	int code;
	@Override
	public String toString() {
		return "Address [city=" + city + ", code=" + code + "]";
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	}
