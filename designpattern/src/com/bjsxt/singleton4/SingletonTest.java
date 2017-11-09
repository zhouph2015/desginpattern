package com.bjsxt.singleton4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
	
	public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		@SuppressWarnings("unchecked")
		Class<SingletonDemo1> clazz = (Class<SingletonDemo1>) Class.forName("com.bjsxt.singleton4.SingletonDemo1");
		Constructor<SingletonDemo1> c = clazz.getDeclaredConstructor(null);
		
		SingletonDemo1 s3 = c.newInstance();
		SingletonDemo1 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);
		
		
	}

}
