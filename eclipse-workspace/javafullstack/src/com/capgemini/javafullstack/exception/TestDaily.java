package com.capgemini.javafullstack.exception;

public class TestDaily {
		public static void main(String[] args) {
			
			System.out.println("main started");
			
			BalanceValidation bv=new BalanceValidation();
			
			bv.verify(1000);
			
			System.out.println("give cash");
			
			System.out.println("main ended");
		}
}
