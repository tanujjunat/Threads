package com.vikas.thread;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " ::: I am main Thread");
		for (int i=0; i<=100; i++) {
			MyThread t1 = new MyThread();
			t1.start();
		}
		
	}

}
