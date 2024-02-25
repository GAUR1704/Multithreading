package com.prowings.interferanceDemo;

public class ThreadInterferenceDemo {
	
	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		
		MyThread1 t1 = new MyThread1(c);
		MyThread2 t2 = new MyThread2(c);
		
		t1.start();
		t2.start();
		
		
	}

}
