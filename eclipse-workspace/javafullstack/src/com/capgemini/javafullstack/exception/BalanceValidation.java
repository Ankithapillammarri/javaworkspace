package com.capgemini.javafullstack.exception;

public class BalanceValidation {
	void verify(int amount) {
		if(amount>10000) {
			DailyLimitException de=new DailyLimitException("plz withdraw 10k");
			throw de;
		}
	}
}
