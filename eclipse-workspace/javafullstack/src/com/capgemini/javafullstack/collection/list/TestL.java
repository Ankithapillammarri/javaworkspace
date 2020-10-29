package com.capgemini.javafullstack.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {
	public static void main(String[] args) {
		
		LinkedList<String> li=new LinkedList<String>();
		li.add("Anil");
		li.add("Priya");
		li.add("Smitha");
		li.add("Raju");
		
		System.out.println("*********Using for loop*****");
		for(int i=0;i<li.size();i++) {
			String r=li.get(i);
			System.out.println(r);
		}
		System.out.println("******Using for-each loop******");
		for(String s:li) {
			System.out.println(s);
		}
		System.out.println("******Using Iterator********");
		Iterator<String> it=li.iterator();
		while(it.hasNext()) {
			String a=it.next();
			System.out.println(a);	
			
		}
		System.out.println("*******Using ListIterator******");
		ListIterator<String> lit=li.listIterator();
		System.out.println("------->Forward");
		while(lit.hasNext()){
			String b=lit.next();
			System.out.println(b);
			
		}
		ListIterator<String> lit1=li.listIterator(li.size());
		System.out.println("<-------Backward");
		while(lit1.hasPrevious()) {
			String c=lit1.previous();
			System.out.println(c);
			
		}
	}
}
