package com.prowings.interferanceDemo;

public class MyThread2 extends Thread{
	
	Counter counter;

	public MyThread2(Counter counter) {
		super();
		this.counter = counter;
	}
	
	
	public void run() {
		
		System.out.println("MT2 is running decrement operation !!!");
		
		System.out.println(Thread.currentThread().getName());
		
		counter.decrement();
		
		System.out.println("After decrement a : " + counter.value());
	}

}
