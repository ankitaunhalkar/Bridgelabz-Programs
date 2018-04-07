package com.bridgelabz.DesginPattern.CreationalPattern.SingletonPattern;

public class EagerInitializedSingleton {

	/**
	 * @param args
	 */
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton()
	{
		
	}
	
	public static EagerInitializedSingleton getInstance() 
	{
		System.out.println("Sending instance");
		return instance;
	}
	
	public void print() {
		System.out.println("hello");
	}
}
