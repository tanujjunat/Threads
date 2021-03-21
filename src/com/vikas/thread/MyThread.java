package com.vikas.thread;

public class MyThread extends Thread {
	
	
	
	public void run()
	{
		
		//for (int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName() + " ::: " + incrementCounter());	
		//}
	
	}
	
	private static int incrementCounter() {
		SupportingClass yclass = new SupportingClass();
		return SupportingClass.incrementCounter();
	}
	
	

}
