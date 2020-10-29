package com.capgemini.javafullstack.lamda;

import java.util.function.Supplier;



public class TestH {
	public static void main(String[] args) {
		
		Supplier<Student> s=()->new Student();
		
		Student r=s.get();
		
		Student t=s.get();
		
		Student y=s.get();
		
		System.out.println(r);
		System.out.println(t);
		System.out.println(y);
	}
}
