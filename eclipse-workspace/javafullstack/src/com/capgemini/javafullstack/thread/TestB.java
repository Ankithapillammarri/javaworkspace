package com.capgemini.javafullstack.thread;

public class TestB {
	public static void main(String[] args) {
		
		Thread t1=new Thread();
		t1.setName("Audio");
		t1.setPriority(3);
		t1.start();
	}
	
}
