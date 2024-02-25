package com.prowings.BookMySeatApp;

public class MyThread1  extends Thread{

	Theater theater;
	int seats;

	public MyThread1(Theater theater, int seats) {
		super();
		this.theater = theater;
		this.seats = seats;
	}

	public void run() {

		theater.bookSeats(seats);
	}

}
