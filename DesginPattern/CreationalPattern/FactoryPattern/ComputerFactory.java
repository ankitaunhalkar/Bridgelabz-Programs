package com.bridgelabz.DesginPattern.CreationalPattern.FactoryPattern;

public abstract class ComputerFactory {
public static Computer getComputer(String type, String ram, String hdd, String cpu)
{
	if("PC".equalsIgnoreCase(type)) return new PersonalComputer(ram, hdd, cpu);
	else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
	return null;
	
}
}
