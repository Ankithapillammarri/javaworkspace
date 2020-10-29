package com.capgemini.javafullstack.thread;

public class TestMarker {

	public static void main(String[] args) {

		Marker m=new Marker();
		
		Thread t1=new Thread(m);

		t1.start();
	}
}
