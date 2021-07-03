package DesignPatterns.Creational_DP.AbstractFactory;

public class SportsCarFactory extends AbstractCarFactory{

	@Override
	public Car getCar() {
		System.out.println("Sports car factory");
		return new SportsCar().createCar();
	}

	
}
