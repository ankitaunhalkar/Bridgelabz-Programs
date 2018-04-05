package com.bridgelabz.DesginPattern.StructuralPattern.AdapterPattern;

public class SocketClassAdapterImp extends Socket implements SocketAdapter {

	public Volts get120Volt() {
		return getVolts();
	}

	public Volts get12Volt() {
		Volts v= getVolts();
		return convertVolt(v,10);
	}
	
	public Volts get3Volt() {
		Volts v= getVolts();
		return convertVolt(v,40);
	}
	private Volts convertVolt(Volts v, int i) {
		return new Volts(v.getVolts()/i);
	}

	

}
