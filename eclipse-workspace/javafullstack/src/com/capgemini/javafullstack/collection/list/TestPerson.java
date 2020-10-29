package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPerson {
	public static void main(String[] args) {
		
		ArrayList<Person> al=new ArrayList<Person>();
		Person p1=new Person(5, "Ramesh", 5.2);
		Person p2=new Person(1, "Manju", 5.9);
		Person p3=new Person(8, "Anil", 5.5);
		Person p4=new Person(4, "Sneha", 5.3);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		PersonById pid=new PersonById();
		PersonByHeight phi=new PersonByHeight();
		PersonByName pnm=new PersonByName();
		
		//Collections.sort(al,pid);
		//Collections.sort(al,phi);
		//Collections.sort(al,pnm);
		
		Collections.sort(al,MyPersonSort.p);
		Iterator<Person> it=al.iterator();
		while(it.hasNext()) {
			Person p=it.next();
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.height);
			System.out.println("------------");
		}
		
	}
}
