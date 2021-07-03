package DesignPatterns.Creational_DP.AbstractFactory;

public class MainCallClass {


	public static void main(String[] args) throws Exception {
		// using the factory class to create the classes 
		// type of the class required is sent for the factory class
		
		AbstractCarFactory ab = new BasicCarFactory();
		CarFactory.createCar(ab);
		
		AbstractCarFactory ab2 = new SportsCarFactory();
		CarFactory.createCar(ab2);
		
	}
}

/**
 * 	ABSTRACT FACTORY PATTERN
 * 
 * main method to include only the factory which creates the object => CarFactory
 * CarFactory will take the abstractFactory type as input which specifies which kind of object is required
 *   -> AbstractCarFactory a = new BasicCarFactory();
 * CarFactory is used to create produce the objects 
 * 
*/