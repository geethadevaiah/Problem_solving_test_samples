package DesignPatterns.Factory;

public interface CarFactory {

	// factory which is responsible for producing the specific objects
	
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
