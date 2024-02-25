package com.prowings.multiThreading;

public class TestYieldMethod {

	public static void main(String[] args) {
		
		JavaYieldExample j1 = new JavaYieldExample();
		JavaYieldExample j2 = new JavaYieldExample();
		
		j2.setPriority(7);
		j1.setPriority(2);
		
		j1.start();
		j2.start();
		
		for(int i = 0 ; i <3 ; i++) {
			j1.yield();
			
			System.out.println(Thread.currentThread().getName()+ "in control");
		}

	}

}
