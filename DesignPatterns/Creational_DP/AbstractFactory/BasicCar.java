package DesignPatterns.Creational_DP.AbstractFactory;

public class BasicCar implements Car {

	@Override
	public Car createCar() {
		System.out.println("Creating basic car!");
		return new BasicCar();
	}

}
