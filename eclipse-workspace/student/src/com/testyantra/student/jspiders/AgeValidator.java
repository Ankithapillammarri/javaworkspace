package com.testyantra.student.jspiders;

public class AgeValidator {
	void validate(int age) throws InvalidAgeException {
		
		if(age<18) {
			throw new InvalidAgeException("You cannot enter to pub");
		}
	}
}
