package DesignPatterns.Structural_DP.Adapter;

public interface SocketVoltageAdapter {

	// is responsible for granting volatge to any devide
	
	public Voltage get120VoltFromSocket();
	
	public Voltage get240VoltFromSocket();
	
	public Voltage get160VoltFromSocket();
	
	public Voltage get3VoltFromSocket();
	
}
