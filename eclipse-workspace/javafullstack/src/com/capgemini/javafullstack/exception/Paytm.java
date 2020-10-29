package com.capgemini.javafullstack.exception;

public class Paytm {
	void book() {
		System.out.println("book started");
		
		
		IRCTC i=new IRCTC();
		//Handling Exception
		try {
		i.cofirm();
		}catch(ArithmeticException a) {
			System.out.println("Exception caught at book()");
		}
		
		System.out.println("book ended");
		
		
	}
}
