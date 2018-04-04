package com.bridgelabz.DesginPattern.CreationalPattern.FactoryPattern;

public class PersonalComputer extends Computer{
	private String ram;
	private String hdd;
	private String cpu;
	
	public PersonalComputer(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}
}
