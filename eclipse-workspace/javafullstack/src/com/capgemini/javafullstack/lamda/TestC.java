package com.capgemini.javafullstack.lamda;

public class TestC {
	public static void main(String[] args) {
		
		BMI b=(h,w)->w/(h*h);
		
		double d=b.calculator(2, 3);
		
		System.out.println(d);
	}
}
