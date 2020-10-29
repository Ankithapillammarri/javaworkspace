package com.capgemini.javafullstack.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		
		//StudebtById s=new StudebtById();
		//StudentByPercentage stByPer=new StudentByPercentage();
		//StudentByName stnm=new StudentByName();
		
		
		TreeSet<Student>ts=new  TreeSet<Student>(MyStudentSort.c1);
		Student s1=new Student(2, "anki", 87.9);
		Student s2=new Student(3, "nikki", 56.9);
		Student s3=new Student(6, "pranu", 45.9);
		Student s4=new Student(5, "deepu", 76.9);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		Iterator<Student> it=ts.iterator();
		while(it.hasNext());
		Student r=it.next();
		System.out.println(r.id);
		System.out.println(r.name);
		System.out.println(r.percentage);
		System.out.println("-----------------");
		
	}
}
