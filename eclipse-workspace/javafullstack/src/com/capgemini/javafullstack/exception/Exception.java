package com.capgemini.javafullstack.exception;

public class Exception {
	 public static void main(String[] args) {
		System.out.println("Main started");
		
		try {
			System.out.println(10/0);
			
		}catch(ArithmeticException a) {
			System.out.println("Dont divide by zero");
		}
		
		System.out.println("Main method");
		
	}

	//public String getMessage() {
		// TODO Auto-generated method stub
		//return null;
	//}
}
