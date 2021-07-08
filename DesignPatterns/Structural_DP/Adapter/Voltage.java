package DesignPatterns.Structural_DP.Adapter;

public class Voltage {

	public int volts;
	
	public Voltage(int volts) {
		super();
		this.volts = volts;
	}

	public Voltage getVoltageDetails() {
		return this;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}

	@Override
	public String toString() {
		return "Voltage [volts=" + volts + "]";
	}
	
	
}
