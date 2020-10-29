package com.capgemini.javafullstack.thread;

public class Marker implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}

	}
}
