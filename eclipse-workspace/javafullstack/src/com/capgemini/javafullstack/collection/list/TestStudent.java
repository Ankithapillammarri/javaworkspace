package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(9, "manu", 87.5);
		Student s2=new Student(4, "priya", 43.5);
		Student s3=new Student(1, "Deepa", 67.5);
		Student s4=new Student(6, "Anil", 54.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student r=it.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.percentage);
			System.out.println("------------------");
		}
	}
}
