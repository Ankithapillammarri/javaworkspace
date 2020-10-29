package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestN {
	public static void main(String[] args) {

		Vector<Character> v=new Vector<Character>();
		v.add('s');
		v.add('A');
		v.add('d');
		v.add('f');
		
		System.out.println("*******Using For loop");
		for(int i=0;i<v.size();i++) {
			Character r=v.get(i);
			System.out.println(r);
		}
		System.out.println("******Using for each loop******");
		for(Character r:v) {
			System.out.println(r);
			
		}
		System.out.println("*******Using Iterator******");
		Iterator<Character> it=v.iterator();
		while(it.hasNext()) {
			Character r=it.next();
			System.out.println(r);
		}
		System.out.println("******Using ListIterator****");
		ListIterator<Character> lit=v.listIterator();
		System.out.println("------>Forward");
		while(lit.hasNext()) {
			Character r=lit.next();
			System.out.println(r);
		}
		System.out.println("<------Backward");
		while(lit.hasPrevious()) {
			Character r=lit.previous();
			System.out.println(r);
		}
		
		

	}
}
