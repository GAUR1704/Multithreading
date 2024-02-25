package com.prowings.multiThreading;

public class TestSleepMethod {

	public static void main(String[] args) {

		MyThreadA a1 = new MyThreadA();

		Thread t1 = new Thread(a1, "T1-thread");
		Thread t2 = new Thread(a1, "T2-thread");

		t1.start();
		t2.start();	

	}

}
