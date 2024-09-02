package com.BASIC_5;

public class Car {
	private Engine engine;
	private Type type;
	private String brand;
	public Car(Engine engine, Type type, String brand) {
		this.engine = engine;
		this.type = type;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return " engine=" + engine.getSize()  + " " + engine.getType()+ 
				"\n type=" + type.getCartype() +" "+type.getTime()+ 
				"\n brand=" + brand;
	}
	
}
