package com.capgemini.javafullstack.thread;

public class BMS {
	synchronized void confirm() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		}
	}
}
