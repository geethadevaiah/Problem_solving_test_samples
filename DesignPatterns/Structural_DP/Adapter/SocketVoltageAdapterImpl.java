package DesignPatterns.Structural_DP.Adapter;

public class SocketVoltageAdapterImpl extends ElectricSocket implements SocketVoltageAdapter {

	@Override
	public Voltage get120VoltFromSocket() {
		
		Voltage v = fetchElectricVoltage();
		v.setVolts(v.getVolts()/2);
		return v;
	}

	@Override
	public Voltage get240VoltFromSocket() {
		Voltage v = fetchElectricVoltage();
		v.setVolts(v.getVolts());
		return v;
	}

	@Override
	public Voltage get160VoltFromSocket() {
		Voltage v = fetchElectricVoltage();
		v.setVolts(v.getVolts()/3);
		return v;
	}

	@Override
	public Voltage get3VoltFromSocket() {
		Voltage v = fetchElectricVoltage();
		v.setVolts(v.getVolts()/8);
		return v;
	}
	

}
