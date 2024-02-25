package com.prowings.multiThreading;

public class ThreadJoinMethod2 {

	public static void main(String[] args) {
		
		ThreadJoinDemo th1 = new ThreadJoinDemo();
		ThreadJoinDemo th2 = new ThreadJoinDemo();
		ThreadJoinDemo th3 = new ThreadJoinDemo();
		
		th1.start();
		
		try {
			
			System.out.println("The current thread name is :" + Thread.currentThread().getName());
			
			th1.join();
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		th2.start();
		
		try {
			System.out.println("THe current thread name is :" + Thread.currentThread().getName());
			
			th2.join();
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		th3.start();
		

	}

}
