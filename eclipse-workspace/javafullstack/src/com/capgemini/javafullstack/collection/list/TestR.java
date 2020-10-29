package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestR {
	public static void main(String[] args) {
		
		
	Comparator<Person> comById=(p1,p2)->{
		if(p1.id>p2.id) {
			return 1;
		}else if(p1.id<p2.id) {
			return -1;
		}
		return 0;
	};
	
	Comparator<Person> comByHeight=(o1,o2)->{
		if(o1.height>o2.height) {
			return 1;
		}else if(o1.height<o2.height) {
			return -1;
		}
		
		return 0;
	};
	Comparator<Person> comByNm=(n1,n2)->{
		return n1.name.compareTo(n2.name);
	};
	
	ArrayList<Person> al=new ArrayList<Person>();
	Person p1=new Person(5, "Ramesh", 5.2);
	Person p2=new Person(1, "Manju", 5.9);
	Person p3=new Person(8, "Anil", 5.5);
	Person p4=new Person(4, "Sneha", 5.3);
	
	al.add(p1);
	al.add(p2);
	al.add(p3);
	al.add(p4);
	
		
	Collections.sort(al,comById);
	Collections.sort(al,comByHeight);
	Collections.sort(al,comByNm);
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
