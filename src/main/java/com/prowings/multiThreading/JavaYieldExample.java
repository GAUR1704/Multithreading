package com.prowings.multiThreading;

public class JavaYieldExample extends Thread {

	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("The current thread name is :" + Thread.currentThread().getName());
		}
	}

}
