package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestK {
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add(3.4);
		li.add(5);
		li.add("Smitha");
		li.add('F');
		
		System.out.println("**********Using for loop*******");
		for(int i=0;i<li.size();i++) {
			Object r=li.get(i);
			System.out.println(r);
		}
		
		System.out.println("*********Using for-each loop*******");
		for(Object r:li) {
			System.out.println(r);
		}
		
		System.out.println("*********Using Iterator*******");
		Iterator it=li.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
		System.out.println("********Using ListIterator********");
		ListIterator lit=li.listIterator();
		while(lit.hasNext()) {
			Object r=lit.next();
			System.out.println(r);
			
		ListIterator lit1=li.listIterator(li.size());
		while(lit1.hasPrevious()) {
			Object r1=lit1.previous();
			System.out.println(r1);
		}
		}
		
		
		
		
		
		
	}
}
