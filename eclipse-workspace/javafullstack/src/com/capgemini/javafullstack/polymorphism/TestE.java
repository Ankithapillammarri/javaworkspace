package com.capgemini.javafullstack.polymorphism;

public class TestE {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("Ankitha");
		e.setHeight(5.3);
		
		DB d=new DB();
		d.receive(e);
	}
}
