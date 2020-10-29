package com.capgemini.javafullstack.polymorphism;

public class DB {
	void receive(Employee e) {
		String name=e.getName();
		int id=e.getId();
		double height=e.getHeight();

		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
	}
}