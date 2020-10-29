package com.capgemini.javafullstack.lamda;

public class TestB {
	public static void main(String[] args) {
		
		Mycircle m=(r)->3.14*r*r;
		
		double d=m.area(2);
		
		System.out.println("Result is "+d);
	}
}
