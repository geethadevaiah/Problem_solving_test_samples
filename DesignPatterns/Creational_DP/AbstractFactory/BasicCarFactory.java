package DesignPatterns.Creational_DP.AbstractFactory;

public class BasicCarFactory extends AbstractCarFactory{

	public Car getCar() {
		System.out.println("In BasicCarFactory:: Returning basic car");
		return new BasicCar().createCar();
	}
}
