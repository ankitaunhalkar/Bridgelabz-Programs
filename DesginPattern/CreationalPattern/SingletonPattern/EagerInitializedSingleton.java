package com.bridgelabz.DesginPattern.CreationalPattern.SingletonPattern;

public class EagerInitializedSingleton {

	/**
	 * @param args
	 */
	public static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton()
	{
		//System.out.println("dcbjb");
	}
	
	public static EagerInitializedSingleton getInstance() 
	{
		return instance;
	}
	
}
