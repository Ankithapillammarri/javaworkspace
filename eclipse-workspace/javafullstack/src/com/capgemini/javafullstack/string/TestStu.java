package com.capgemini.javafullstack.string;

public class TestStu {
	public static void main(String[] args) {
		
		Student s=new Student("Priya",24);
		
		System.out.println("Name is "+s.getName());
		
		System.out.println("Age is "+s.getAge());
		
		Student s1=new Student("ankitha",22);
		
		System.out.println("Name is "+s1.getName());
		
		System.out.println("Age is "+s1.getAge());
				
	}
}
