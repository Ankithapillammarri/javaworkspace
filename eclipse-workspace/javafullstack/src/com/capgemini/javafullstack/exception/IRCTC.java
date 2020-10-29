package com.capgemini.javafullstack.exception;

public class IRCTC {
	void cofirm() {
		System.out.println("confirm started");
		//For Handling exception
		try {
			System.out.println(10/0);//System.out.println(10/2);
		}catch(ArithmeticException a) {
			System.out.println("exception caught at confirm");
			throw a;
			
		}finally {
		
		System.out.println("confirm ended");
		}
	}
}
