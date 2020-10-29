package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestQ {
	public static void main(String[] args) {
		
		ArrayList<Character> al=new ArrayList<Character>();
		
		al.add('A');
		al.add('S');
		al.add('D');
		al.add('F');
		
		System.out.println("*****Using for loop*****");
		for(int i=0;i<al.size();i++) {
			Character r=al.get(i);
			System.out.println(r);
		}
		
		System.out.println("*********Using for-each loop******");
		for(Character c:al) {
			System.out.println(c);
			}
		System.out.println("******Using Iterator***** ");
		Iterator<Character> it=al.iterator();
		while(it.hasNext()) {
			Character c=it.next();
			System.out.println(c);
		}
		System.out.println("*********Using ListIterator*****");
		ListIterator<Character> lit=al.listIterator();
		System.out.println("------->forward");
		while(lit.hasNext()) {
			Character c=lit.next();
			System.out.println(c);
		}
		System.out.println("<-------backward");
		while(lit.hasPrevious()) {
			Character c=lit.previous();
			System.out.println(c);
		}
	}
	
	
	
}
