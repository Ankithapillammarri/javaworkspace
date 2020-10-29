package com.capgemini.javafullstack.exception;

public class ExceptionIp {
	public static void main(String[] args) {
		System.out.println("main started");
		
		
		Paytm paytm=new Paytm();
		//Handling exception
		try {
		paytm.book();
		
		}catch(ArithmeticException a) {
			System.out.println("exception at main method");
		}
		
		System.out.println("Main ended");
		
		
	}
}
