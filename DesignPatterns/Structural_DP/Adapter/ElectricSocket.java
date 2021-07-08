package DesignPatterns.Structural_DP.Adapter;

public class ElectricSocket {

	public Voltage fetchElectricVoltage() {
		return new Voltage(240);
	}
}
