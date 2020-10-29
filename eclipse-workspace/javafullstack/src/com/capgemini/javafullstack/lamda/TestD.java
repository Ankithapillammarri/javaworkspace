package com.capgemini.javafullstack.lamda;

public class TestD {
	public static void main(String[] args) {
		
		MyInterest i=(p,t,r)->(p*t*r)/100;
		
		double d=i.si(1, 5, 5);
		System.out.println("Result is "+d);
	}
}
