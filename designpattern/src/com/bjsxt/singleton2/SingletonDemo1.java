package com.bjsxt.singleton2;

/*
 * singleton design pattern
 * lazy model singleton
 * only create the instance when you need to use it
 * 
 * */

public class SingletonDemo1 {
	
	private static SingletonDemo1  instance;
	
	private SingletonDemo1(){
		if(null != instance){
			throw new RuntimeException();
		}
		
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
	
	
	public static SingletonDemo1 getInstance1(){
		
		synchronized(SingletonDemo1.class){
			if(null == instance){
				instance = new SingletonDemo1();
			}
		}
		return instance;
	}
	
	public static SingletonDemo1 getInstance2(){
		if (null == instance) {
			synchronized (SingletonDemo1.class) {
				if (null == instance) {
					instance = new SingletonDemo1();
				}
			}
		}
		return instance;
	}

}
