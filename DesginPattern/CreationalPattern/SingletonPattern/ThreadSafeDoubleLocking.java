package com.bridgelabz.DesginPattern.CreationalPattern.SingletonPattern;



public class ThreadSafeDoubleLocking {
	private static ThreadSafeDoubleLocking instance;
	public static ThreadSafeDoubleLocking getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeDoubleLocking();
	            }
	        }
	    }
	    return instance;
	}
}
