package com.capgemini.javafullstack.lamda;

import java.util.function.Consumer;

public class TestI {
	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="Ankitha";
		s.age=22;
		
		Consumer<Student> c=st-> {
			System.out.println("Name is "+st.name);
			System.out.println("Age is "+st.age);
		};
		c.accept(s);
	}
}
