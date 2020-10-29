package com.capgemini.javafullstack.exception;

public class Exception3 {
	public static void main(String[] args) {
		
		String s=null;
		int ar[]=new int[3];
		System.out.println("Main started");
		try {
			
			ar[9]=100;
			
			s.toUpperCase();
			
			System.out.println(10/0);
		}catch(ArithmeticException |NullPointerException |ArrayIndexOutOfBoundsException a) {
			
			a.printStackTrace();
		}
		System.out.println("Main ended");
	}
}
