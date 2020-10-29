package com.capgemini.javafullstack.abstraction;

public class ATMmachine {
	void slot(ATM a) {
		a.validateCard();
		a.getAccountInfo();
	}
}
