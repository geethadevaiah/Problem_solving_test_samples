package DesignPatterns.Factory;

public class SportsCar implements Car {

	@Override
	public Car createCar() {
		System.out.println("Creating sports car");
		return new SportsCar();
	}

}