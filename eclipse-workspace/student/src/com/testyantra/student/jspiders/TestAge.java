package com.testyantra.student.jspiders;

public class TestAge {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		AgeValidator a=new AgeValidator();
		
		try {
			a.validate(19);
			System.out.println("Welcome to pub");
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Main ended");
	}
}
