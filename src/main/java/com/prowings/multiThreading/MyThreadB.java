package com.prowings.multiThreading;

public class MyThreadB  extends Thread{
	
	public void run() {
		
		for (int i = 0 ; i<2 ; i++) {
			
			try {
				Thread.sleep(3000);
				
				System.out.println("The current thread name is " + Thread.currentThread().getName());
			}
			catch (Exception e) {
				
				System.out.println("The exception has been catch " + e);
			}
			System.out.println(i);
		}
	}
}
