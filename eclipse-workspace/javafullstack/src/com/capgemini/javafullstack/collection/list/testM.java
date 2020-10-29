package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class testM {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(44);
		v.add('A');
		v.add("Raju");
		v.add(true);
		
		System.out.println("*******Using for loop****");
		for(int i=0;i<v.size();i++) {
			Object r=v.get(i);
			System.out.println(r);
		}
		System.out.println("********Using For each loop*****");
		for(Object r:v) {
			System.out.println(r);
		}
		System.out.println("********Using Iterator******");
		Iterator it=v.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
		ListIterator lit=v.listIterator();
		System.out.println("----->forward");
		while(lit.hasNext()) {
			Object r=lit.next();
			System.out.println(r);
		}
		System.out.println("<------Backward");
		while(lit.hasPrevious()) {
			Object r=lit.previous();
			System.out.println(r);
		}
	}
}
