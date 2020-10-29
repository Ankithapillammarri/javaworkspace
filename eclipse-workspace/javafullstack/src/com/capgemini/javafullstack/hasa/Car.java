package com.capgemini.javafullstack.hasa;

public class Car {
	int model;
	MusicPlayer m=new MusicPlayer();
	void move() {
		System.out.println("I am a move method");
		System.out.println("Model is "+model);
	}
}
