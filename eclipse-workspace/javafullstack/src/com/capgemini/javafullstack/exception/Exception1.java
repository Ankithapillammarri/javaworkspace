package com.capgemini.javafullstack.exception;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		int a[]=new int[4];
		try {
			a[9]=90;
			
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Dont cross Array boundry");
		}
			System.out.println("main ended");
		
	}
}
