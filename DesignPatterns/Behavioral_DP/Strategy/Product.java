package DesignPatterns.Behavioral_DP.Strategy;

public class Product {

	private String name ;
	private int value;
	
	public Product(String name, int val) {
		this.name = name;
		this.value = val;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
