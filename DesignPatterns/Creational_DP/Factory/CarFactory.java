package DesignPatterns.Creational_DP.Factory;

public interface CarFactory {

	// factory which is responsible for producing the specific objects
	
	// this works only small number of objects are to be created as per use case
	// if the types of objects increases, then if-else ladder increase
	// in that case move to abstract DP since it will violate open-close principle
	
	public static Car createCar(String type) throws Exception {
		// based on the input type of the object 
		// new objects are created
		if(type.equals("Sports")) {
			return new SportsCar().createCar();
		}
		if(type.equals("Basic")) {
			return new BasicCar().createCar();
		}
		else {
			throw new Exception("NA");
		}
	}
}
