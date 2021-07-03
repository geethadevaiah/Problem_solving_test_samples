package DesignPatterns.Creational_DP.AbstractFactory;

public class CarFactory{

	// factory which is responsible for producing the specific objects
	// instead of getting the type of car required in String, ABSTRACT class is input-- > which defines the type1
	public static Car createCar(AbstractCarFactory abstractCarFactory){
		// based on the input type of the object 
		// new objects are created
		return abstractCarFactory.getCar();
		// so this Factory is closed for any more changes in abstract factory pattern
	}
}
