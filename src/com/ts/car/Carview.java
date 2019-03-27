package com.ts.car;

public class Carview {
	public void view(Car car) {
		System.out.println("엔진 파워 : "+car.engine.hp);
		for(int i=0;i<car.wheel.length;i++) {
			System.out.println("Wheel Color : "+car.wheel[i].color);
			System.out.println("Whell Size : "+car.wheel[i].size);
		}
		System.out.println("Color : "+car.color);
	}
}
