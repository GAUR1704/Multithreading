package com.prowings.BookMySeatApp;

public class Theater {

	int totalSeats = 10;

	public void bookSeats(int seats) {

		synchronized (this) {

			{
				if (seats <= totalSeats) {

					System.out.println(seats + "Seats bookes sucessfull by " + Thread.currentThread().getName());

					totalSeats = totalSeats - seats;

					System.out.println("Remaining seats after booking : " + totalSeats);

				}

				else

					System.out.println("Can book : " + seats + " seats... Avilable seats are " + totalSeats);

			}
		}

	}

}
