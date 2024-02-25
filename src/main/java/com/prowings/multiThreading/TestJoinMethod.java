package com.prowings.multiThreading;

public class TestJoinMethod {

	public static void main(String[] args) {

		MyThreadB b1 = new MyThreadB();
		MyThreadB b2 = new MyThreadB();
		MyThreadB b3 = new MyThreadB();

		Thread t1 = new Thread(b1, "Thread-1");
		Thread t2 = new Thread(b2, "Thread-2");
		Thread t3 = new Thread(b3, "Thread-3");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		t2.start();

		try {

			t2.join();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		t3.start();

	}

}
