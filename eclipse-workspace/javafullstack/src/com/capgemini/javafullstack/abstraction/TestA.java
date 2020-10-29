package com.capgemini.javafullstack.abstraction;

public class TestA {
	public static void main(String[] args) {
		
		ATMmachine a=new ATMmachine();
		
		ICICI icici=new ICICI();
		
		a.slot(icici);
		
	
		
		
	}
}
