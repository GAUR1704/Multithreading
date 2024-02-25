package com.prowings.multiThreading;

public class MyThreadA extends Thread {

	public void run() {

		System.out.println("Inside run method ");

		for (int i = 0; i < 3; i++) {
			
			try {
				Thread.sleep(3000);
				System.out.println("The current thread mane is :"+ Thread.currentThread().getName());
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(i+"  "+Thread.currentThread().getName());

		}
	}

}
