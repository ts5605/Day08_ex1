package com.ts.car;

public class CarFactory {
	public void makeCar() {
		EngineAdd en = new EngineAdd();
		WheelAdd wa = new WheelAdd();
		Carview cv = new Carview();
		Colorpaint cp = new Colorpaint();
		
		Car car = new Car();
		car = en.setEngine(car);
		car = wa.setWheel(car);
		cp.setColor(car);
	//	cv.view(car);
		car.info("Blue");
		Car car2 = new Car();
		car2.color="White";
		car2.info("Red");
	}
}
