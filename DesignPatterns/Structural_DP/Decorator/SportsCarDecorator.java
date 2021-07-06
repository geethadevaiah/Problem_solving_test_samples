package DesignPatterns.Structural_DP.Decorator;

public class SportsCarDecorator extends CarDecorator{

	public SportsCarDecorator(Car car) {
		super(car);
	}
	public void manufactureCar() {
		// first basic car be created
		super.manufactureCar();
		
		System.out.println("including the features of sports car..");
	}	
}
