package com.capgemini.javafullstack.lamda;

public class TestA {
	public static void main(String[] args) {
		
		Demo d=(a,b)->a+b;
		
		int i=d.add(10, 5);
		
		System.out.println("Result is "+i);
	}
}
