package com.bridgelabz.DesginPattern.StructuralPattern.AdapterPattern;

public class AdapterPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();

	}

	private static void testObjectAdapter() {
		
		SocketAdapter sockAdapter = new SocketObjectAdapterImp();
		Volts v3 = getVolts(sockAdapter,3);
		Volts v12 = getVolts(sockAdapter,12);
		Volts v120 = getVolts(sockAdapter,120);
	
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImp();
		Volts v3 = getVolts(sockAdapter,3);
		Volts v12 = getVolts(sockAdapter,12);
		Volts v120 = getVolts(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
		
	}
	private static Volts getVolts(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
}
