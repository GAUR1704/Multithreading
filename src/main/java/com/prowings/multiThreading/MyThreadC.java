package com.prowings.multiThreading;

public class MyThreadC extends Thread {

	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			
			System.out.println("Demon thread work "+ Thread.currentThread().getName());
		}
		
		else 
		{
			System.out.println("User thread work : "+ Thread.currentThread().getName());
		}
	}
}
