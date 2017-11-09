package com.bjsxt.singleton4;

/*
 *inner static inner class type
 *
 *high efficient
 *class load only one instance during class loading process
 *thread safe high efficient and delay class loading
 * 
 * */

public class SingletonDemo1 {
	
	private static class SingletonClassInstance{
		private static final SingletonDemo1 instance = new SingletonDemo1();
	}

	
	SingletonDemo1(){
		
	}
	
	/*
	 * lazy mode singleton mode
	 * lower load efficient
	 * 
	 * */
    public static SingletonDemo1 getInstance(){
    	return SingletonClassInstance.instance;
    }


}
