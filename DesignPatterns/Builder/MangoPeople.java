package DesignPatterns.Builder;

public class MangoPeople {

	public static void main(String[] args) {
		Car car = new Car.CarBuilder("sw", "br", "mr").build();
		System.out.println(car.toString());
	}
}
