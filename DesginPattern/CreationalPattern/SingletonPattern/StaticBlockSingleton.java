package com.bridgelabz.DesginPattern.CreationalPattern.SingletonPattern;

public class StaticBlockSingleton {

	/**
	 * @param args
	 */
	private static StaticBlockSingleton instance;
	
	static{
		try{
			instance=new StaticBlockSingleton();
		}catch(Exception e)
		{
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	
	 public static StaticBlockSingleton getInstance(){
	        return instance;
	    }
}
