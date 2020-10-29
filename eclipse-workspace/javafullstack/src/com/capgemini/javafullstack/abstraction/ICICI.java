package com.capgemini.javafullstack.abstraction;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("....validate card....");
		System.out.println("Validating the ICICI card");
	}

	@Override
	public void getAccountInfo() {
		System.out.println(".....getAccountInfo....");
		System.out.println("Getting the Account Info");
	}

}
