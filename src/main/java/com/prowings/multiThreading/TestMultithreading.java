package com.prowings.multiThreading;

public class TestMultithreading {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
				
		System.out.println(t1.getState());
		
		System.out.println(t1.isAlive()); 
		
		t1.setDaemon(false); // convert the user thread into demon thread.(demon thread means the thread is continuously running in background.)
		
		System.out.println(t1.isDaemon()); // checks the thread is demon or not.
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		
		t1.setPriority(9);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
	}
}