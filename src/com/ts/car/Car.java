package com.ts.car;

public class Car {
	Engine engine;
	Wheel [] wheel;
	String color;
	
	public void info (String color) {
		System.out.println(color);
		System.out.println(this.color);
		
	}
	
}
