package DesignPatterns.Creational_DP.Factory;

public class MainCallClass {


	public static void main(String[] args) throws Exception {
		// using the factory class to create the classes 
		// type of the class required is sent for the factory class
		Car car1 = CarFactory.createCar("Sports");
		Car car2 = CarFactory.createCar("Basic");
	}
}


/**
 * 	FACTORY PATTERN
 * 
 * main method to include only the factory which creates the object => CarFactory
 * CarFactory will take the String type as input which specifies which kind of object is required
 * CarFactory is used to create produce the objects 
 * 
*/