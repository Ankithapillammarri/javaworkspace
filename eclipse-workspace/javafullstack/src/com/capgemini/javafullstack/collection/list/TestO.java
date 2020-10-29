package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestO {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("anki");
		al.add("pranu");
		al.add("mohan");
		al.add("shailu");
		
		System.out.println("****Using for loop*****");
		for(int i=0;i<al.size();i++) {
			String r=al.get(i);
			System.out.println(r);
		}
		System.out.println("******Using for each loop******");
		for(String r:al) {
			System.out.println(r);
		}
		System.out.println("*******Using Iterator*****");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
		String s=it.next();
		System.out.println(s);
		}
		System.out.println("*****ListIterator******");
		ListIterator<String> lit=al.listIterator();
		System.out.println("------->forward");
		while(lit.hasNext()) {
			String s=lit.next();
			System.out.println(s);
		}
		System.out.println("<-------Backward");
		while(lit.hasPrevious()) {
			String s=lit.previous();
			System.out.println(s);
		}
		
	}
}
