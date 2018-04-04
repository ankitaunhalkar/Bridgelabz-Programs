package com.bridgelabz.DesginPattern.CreationalPattern.SingletonPattern;

public class ThreadSafeSingleton {
private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
