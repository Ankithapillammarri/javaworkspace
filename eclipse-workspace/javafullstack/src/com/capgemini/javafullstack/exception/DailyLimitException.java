package com.capgemini.javafullstack.exception;

public class DailyLimitException extends RuntimeException{
	
	private String message="You are crossing daily limit of 10k";
	
	public DailyLimitException() {
		
	}

	public DailyLimitException(String message) {
		this.message = message;//to get message to the user
	}

	@Override
	public String getMessage() {
		return message;//to get message to the user
	}
	
	
	}


