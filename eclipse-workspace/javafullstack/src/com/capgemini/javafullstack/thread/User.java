package com.capgemini.javafullstack.thread;

public class User extends Thread {

	BMS ref;
	User(BMS b){
		ref=b;
		
	}
	@Override
	public void run() {
		ref.confirm();
	}
}
