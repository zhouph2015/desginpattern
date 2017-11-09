package com.bjsxt.singleton1;

/*
 * singleton design pattern
 * lazy model singleton
 * only create the instance when you need to use it
 * 
 * */

public class SingletonDemo1 {
	
	private static SingletonDemo1  instance;
	
	private SingletonDemo1(){
		
	}
	
	/*
	 * lazy mode singleton mode
	 * lower load efficient
	 * 
	 * */

	public static synchronized SingletonDemo1 getInstance(){
		
		if(null == instance){
			instance = new SingletonDemo1();
		}
		return instance;
	}
	
	

}
