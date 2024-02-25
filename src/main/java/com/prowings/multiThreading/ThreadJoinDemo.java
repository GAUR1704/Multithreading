package com.prowings.multiThreading;

public class ThreadJoinDemo extends Thread{
	
	public void run() {
		
		for(int j= 0 ; j <2 ; j++) {
			
			try {
				Thread.sleep(3000);
				
				System.out.println("The current thread name is "+ Thread.currentThread().getName());
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
				
				System.out.println("The exception has been catch "+ e);
			}
			
			System.out.println(j);
			
		}
		
	}

}
