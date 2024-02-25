package com.prowings.multiThreading;

public class MyThread extends Thread {

	public void run() {

		System.out.println("My thread is runing "+Thread.currentThread().getName());
	}

}
