package com.tanuj.producer.consumer;

import java.util.LinkedList;

public class Processor {
	
	LinkedList<Integer> list = new LinkedList<>();
	private final int limit = 10;
	Object lock = new Object();
	
	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			
			synchronized (lock) {
				
				while (list.size() == limit) {
					lock.wait();
				}	
				list.add(value++);
				System.out.println("Value added : " + value);
				lock.notify();
				
			}
	
			
		}
	}
	
	public void consume() throws InterruptedException {		
		while(true) {
			synchronized (lock) {
				while (list.size() == 0) {
					lock.wait();
				}
				System.out.print("List size is " + list.size());
				int data = list.removeFirst();
				System.out.println("Value removed : " + data);
				lock.notify();

			}
			Thread.sleep(500);
			
		}
		
	}

}
