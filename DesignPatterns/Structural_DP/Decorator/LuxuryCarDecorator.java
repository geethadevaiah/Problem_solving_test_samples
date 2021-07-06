package DesignPatterns.Structural_DP.Decorator;

public class LuxuryCarDecorator extends CarDecorator{

	public LuxuryCarDecorator(Car car) {
		super(car);
	}
	
	public void manufactureCar() {
		// first basic car be created
		super.manufactureCar();
		
		System.out.println("including the features of luxury car..");
	}	
}
