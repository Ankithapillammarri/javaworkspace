package com.capgemini.javafullstack.polymorphism;

public class Train {
	void search(int num) {
		System.out.println("Searching train by number "+num);
	}

	void search(String name) {
		System.out.println("Searching train by name "+name);
	}
}
