package com.vikas.thread;

public class SupportingClass {
	
	static int i = 0;
	
	public static synchronized int incrementCounter()
	{
		return i++;
      
	}

}
