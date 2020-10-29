package com.capgemini.javafullstack.array;

public class TestStudent {
	void display(Student[] a) {
		
		for(Student s:a) {
			System.out.println("Name is "+s.getName());
			System.out.println("ID is "+s.getId());
			System.out.println("Height is "+s.getHeight());
			
			
		}
	}
}
