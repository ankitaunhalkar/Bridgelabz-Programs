package com.bridgelabz.DesginPattern.CreationalPattern.SingletonPattern;

public class sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//EagerInitializedSingleton s=new EagerInitializedSingleton();
		//StaticBlockSingleton s=new StaticBlockSingleton();
		//EnumSingleton s=EnumSingleton.INSTANCE;
//		EnumSingleton.doSomething();
//		EnumSingleton m=EnumSingleton.INSTANCE;
//		EnumSingleton m1=EnumSingleton.INSTANCE;
//		System.out.println(m1.equals(m));
//		System.out.println(EnumSingleton.INSTANCE.getValue());
//		EnumSingleton.INSTANCE.setValue(10);
//		System.out.println(EnumSingleton.INSTANCE.getValue());
		
	/*	EnumSingleton s = EnumSingleton.INSTANCE;
		System.out.println(s);
		EnumSingleton s1 = EnumSingleton.INSTANCE;
		System.out.println(s1);
		EnumSingleton s2=EnumSingleton.INSTANCE;
		s2.setValue(new sample());
		s2.doSomething();*/
	//	EnumSingleton service = EnumSingleton.INSTANCE;
	//	//service.doSomething();
	//	System.out.println(service.add(5, 10));
		//Eager
		EagerInitializedSingleton s=EagerInitializedSingleton.getInstance();
		s.print();
	}

}
