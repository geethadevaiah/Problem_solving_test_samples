package DesignPatterns.Structural_DP.Decorator;

public class ElonMuskCarManufacturingUnit {

	
	public static void main(String[] args) {
		
		// Demand for the sports car
		Car sportsCar = new SportsCarDecorator(new BaseCar());
		sportsCar.manufactureCar();
		
		// Electric car
		Car electricCar = new ElectricCarDecorator(new BaseCar());
		electricCar.manufactureCar();
		
		// hybrid decorators to include   -----> Decorator pattern!!!!!
		// sports on top of it electric features
		Car sportsElectricCar = new ElectricCarDecorator(new SportsCarDecorator(new BaseCar()));
		sportsElectricCar.manufactureCar();
	}
}
