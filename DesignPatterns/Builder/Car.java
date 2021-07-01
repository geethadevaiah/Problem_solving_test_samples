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
	}

	//create inner static builder class
	public static class CarBuilder{
		/**
		 * mandatory attributes
		 */
		private String steeringWheels;
		private String brake;
		private String mirror;
		// optional params
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
			 
		 // this method will be used for creating attributes
		public Car build() {
			return new Car(this);
		}

		@Override
		public String toString() {
			return "CarBuilder [steeringWheels=" + steeringWheels + ", brake=" + brake + ", mirror=" + mirror
					+ ", seatCovers=" + seatCovers + ", musicSystem=" + musicSystem + "]";
		}
	}
	
}


