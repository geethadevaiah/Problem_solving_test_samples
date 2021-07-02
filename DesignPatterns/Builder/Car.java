package DesignPatterns.Builder;

/**
 * Builder method is considered when there is large objects involved with 
 * some mandatory attributes and optional attributes
 * 
 * 
 * 
 * @author Geetha
 *
 */

public class Car {

	// mandatory params
	private String steeringWheels;
	private String brake;
	private String mirror;
	
	// optional params
	private String seatCovers;
	private String musicSystem;
	
	public Car(CarBuilder carBuilder) {
		this.steeringWheels = carBuilder.steeringWheels;
		this.brake = carBuilder.brake;
		this.mirror = carBuilder.mirror;
		this.seatCovers = carBuilder.seatCovers;
		this.mirror = carBuilder.mirror;
		this.musicSystem = carBuilder.musicSystem;
	}

	//create inner static builder class
	public static class CarBuilder{
		// mandatory attributes
		private String steeringWheels;
		private String brake;
		private String mirror;
		// optional attributes
		private String seatCovers;
		private String musicSystem;
		
		public CarBuilder(String steeringWheel, String brake, String mirror) {
			this.steeringWheels = steeringWheel;
			this.brake = brake;
			this.mirror = mirror;
		}
		
		public CarBuilder setSeatCovers(String seatCover) {
			this.seatCovers = seatCover;
			return this;
		}
		public CarBuilder setMusicSystem(String musicSystem) {
			this.musicSystem = musicSystem;
			return this;
		}	
			 
		 // this method will be used for creating CAR
		public Car build() {
			return new Car(this);
		}
	}

	@Override
	public String toString() {
		return "Car [steeringWheels=" + steeringWheels + ", brake=" + brake + ", mirror=" + mirror + ", seatCovers="
				+ seatCovers + ", musicSystem=" + musicSystem + "]";
	}
	
}
/**
 * Build method
 * 
 * Heavy class with lots of attributes where some are mandatory and some are optional
 * 
 * Builder class is created inside main object: Car as inner static class with the same attributes as main class
 * Main class constructor is public which takes in the Builder class as args and sets each attributes to that class
 * 
 * Builder class with same attributes as main has a public constructor to set the mandatory params only.
 * Builder class has public setter methods for each of the optional params so that it can be used from outside
 * Builder class has "build()" method where the main object: Car is created.
 * 
 * EX:: Car car2 = new Car.CarBuilder("sw1", "brake", "mirror").setMusicSystem("Ms1").setSeatCovers("sc").build();
 * 
 */

