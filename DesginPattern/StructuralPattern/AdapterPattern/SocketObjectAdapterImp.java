package com.bridgelabz.DesginPattern.StructuralPattern.AdapterPattern;

public class SocketObjectAdapterImp extends Socket implements SocketAdapter {
	private Socket sock = new Socket();
	public Volts get120Volt() {
	
		return sock.getVolts();
	}

	public Volts get12Volt() {
		Volts v=sock.getVolts();
		return convertVolt(v, 10);
	}

	public Volts get3Volt() {
		
		Volts v= sock.getVolts();
		return convertVolt(v,40);
	}
	private Volts convertVolt(Volts v, int i) {
		return new Volts(v.getVolts()/i);
	}
}
