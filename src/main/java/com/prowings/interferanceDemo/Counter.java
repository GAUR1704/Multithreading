package com.prowings.interferanceDemo;

public class Counter {
	
	public static  volatile int a = 5;
	
	public void increment() {
		
		a++;
	}
	
	public void decrement() {
		
		a--;
	}
	
	public int value() {
		
		return a ;
	}

}
