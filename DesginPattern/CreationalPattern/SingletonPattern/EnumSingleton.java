package com.bridgelabz.DesginPattern.CreationalPattern.SingletonPattern;

public enum EnumSingleton {
    INSTANCE;
    
    public int multiply(int a, int b) {
    	return a * b;
    }
    
    public int add(int a, int b) {
    	return a + b;
    }
    
    EnumSingleton() {
	 
	}
    
    
    public static EnumSingleton doSomething(){
       System.out.println("Hello");
       return INSTANCE;
    }
  
}
/*class Singleton
{
	public static void main(String[] args) {
		EnumSingleton s=EnumSingleton.INSTANCE;
		s.doSomething();
	}
}*/