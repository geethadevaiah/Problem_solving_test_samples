package DesignPatterns.Creational_DP.Builder;

public class MangoPeople {

	public static void main(String[] args) {
		Car car1 = new Car.CarBuilder("sw", "br", "mr").build();
		System.out.println(car1.toString());
		
		// using builder class to set the attributes
		
		Car car2 = new Car.CarBuilder("sw1", "brake", "mirror").setMusicSystem("Ms1").setSeatCovers("sc").build();
		System.out.println(car2.toString());
	}
}
