package com.capgemini.javafullstack.thread;

public class TestBMS {
	public static void main(String[] args) {
		
		BMS b=new BMS();
		User u1=new User(b);
		u1.start();
		
		
		User u2=new User(b);
		u2.start();
	}
}
