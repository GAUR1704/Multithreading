package com.prowings.BookMySeatApp;

public class BookMySeatsApp {

	public static void main(String[] args) {
		
		Theater theater = new Theater();
		
		MyThread1 t1 = new MyThread1(theater, 7);
		MyThread2 t2 = new MyThread2(theater, 5);
		
		t1.setName("Gaurav");
		
		t2.setName("Vaibhav");	
		
		t1.start();
		t2.start();
		
		

	}

}
