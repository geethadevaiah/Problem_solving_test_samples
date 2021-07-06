package DesignPatterns.Structural_DP.Decorator;

public class ElectricCarDecorator extends CarDecorator{
	
	protected Car car ;
	
	public ElectricCarDecorator(Car car) {
		super(car);
	}
	
	public void manufactureCar() {
		// first basic car be created
		super.manufactureCar();
		
		System.out.println("including the features of electric car..");
	}

}
