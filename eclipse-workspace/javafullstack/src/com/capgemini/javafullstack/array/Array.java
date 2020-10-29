package com.capgemini.javafullstack.array;
	
public class Array {
	public static void main(String[] args) {
		
		TestStudent t=new TestStudent();
		
		Student[] s=new Student[5];
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Anki");
		s1.setHeight(5.5);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("manu");
		s2.setHeight(5.4);
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("pranu");
		s3.setHeight(5.5);
		
		Student s4=new Student();
		s4.setId(4);
		s4.setName("mohan");
		s4.setHeight(5.6);
		
		Student s5=new Student();
		s5.setId(5);
		s5.setName("shailaja");
		s5.setHeight(5.5);
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		s[4]=s5;
		
		t.display(s);
	}
}
