package com.capgemini.javafullstack.polymorphism;

public class TestEmp {
	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.setId(1);
		e1.setName("ankitha");
		e1.setSalary(1000);
		e1.setPhone(84999l);
		e1.setAge(22);
		e1.setDesignation("SSD");
		e1.setAddress("Warangal");
		e1.setGender("Female");
		e1.setEmail("anki@gmail.com");
		
		StoreEmployee s=new StoreEmployee();
		s.save(e1);
	}
}
