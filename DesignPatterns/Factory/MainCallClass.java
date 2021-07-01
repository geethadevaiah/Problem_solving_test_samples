package DesignPatterns.Factory;

public class MainCallClass {


	public static void main(String[] args) throws Exception {
		// using the factory class to create the classes 
		// type of the class required is sent for the factory class
		Car car1 = CarFactory.createCar("Sports");
		Car car2 = CarFactory.createCar("Basic");
	}
}
