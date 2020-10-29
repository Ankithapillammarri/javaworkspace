package com.capgemini.javafullstack.exception;

public class Exception2 {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Cow c=null;
		try {
			c.eat();
			
		}catch(NullPointerException a) {
			System.out.println("Dont deal with null");
		}
		System.out.println("Main ended");
	}
}
