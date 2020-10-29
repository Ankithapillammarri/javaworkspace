package com.capgemini.javafullstack.thread;

public class TestC {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		Pen p=new Pen();
		p.setDaemon(true);
		p.start();
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		System.out.println("Main ended");
	}
}
