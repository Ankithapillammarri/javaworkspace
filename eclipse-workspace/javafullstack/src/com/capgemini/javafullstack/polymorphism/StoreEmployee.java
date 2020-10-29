package com.capgemini.javafullstack.polymorphism;

public class StoreEmployee {
	void save(Employee1 e1) {
		
		
		System.out.println("ID is "+e1.getId());
		System.out.println("Name is "+e1.getName());
		System.out.println("Salary is "+e1.getSalary());
		System.out.println("Designation is "+e1.getDesignation());
		System.out.println("Age is "+e1.getAge());
		System.out.println("Email is "+e1.getEmail());
		System.out.println("Phone is "+e1.getPhone());
		System.out.println("Gender is "+e1.getGender());
		System.out.println("Address is "+e1.getAddress());
	}
}
