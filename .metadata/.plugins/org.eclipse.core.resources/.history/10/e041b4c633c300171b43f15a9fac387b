package com.bjsxt.singleton;

/*
 * singleton design pattern
 * 
 * */

public class SingletonDemo1 {
	
	private static SingletonDemo1  instance = new SingletonDemo1(); //load in the beginning
	
	private SingletonDemo1(){
		
	}
	
	//no necessary to synchronized keyword to thread safe
	//high efficient to use
	// no delay load if it will never used
	public static SingletonDemo1 getInstance(){
		return instance;
	}

}
