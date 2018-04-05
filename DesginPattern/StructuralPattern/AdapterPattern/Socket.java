package com.bridgelabz.DesginPattern.StructuralPattern.AdapterPattern;

public class Socket {
public Volts getVolts() {
	return new Volts(120);
}
}
