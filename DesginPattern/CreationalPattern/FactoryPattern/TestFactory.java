package com.bridgelabz.DesginPattern.CreationalPattern.FactoryPattern;

public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer("PC", "2 GB", "1 TB", "2.4 Gz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println(pc);
		System.out.println(server);
		
		
	}

}
