package DesignPatterns.Structural_DP.Adapter;

public class AdapterTest {

	public static void main(String[] args) {
		SocketVoltageAdapter adapter = new SocketVoltageAdapterImpl();
		
		Voltage v1 = adapter.get120VoltFromSocket();
		System.out.println(v1.toString());
		Voltage v120 = adapter.get160VoltFromSocket();
		System.out.println(v120.toString());
	}
}
/***
 * 
 * SocketVoltageAdapterImpl has various methods to adapt itself according to the client requirements
 * Client need not worry about the changes need just have to invoke different methods from the same 
 * adapter class.
 * 
 *  Voltage - volts
 *  ElectricSocket has the method to fetch the Voltage 
 *  SocketVoltageAdapter - interface
 *  SocketVoltageAdapterImpl - implementing all the methods of adapter
 */