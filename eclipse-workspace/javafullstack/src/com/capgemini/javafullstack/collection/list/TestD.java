package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();

		al.add(5);
		al.add('p');
		al.add(2.4);
		al.add("divya");
		
		ListIterator lit=al.listIterator();
		System.out.println("------->forward");
		while(lit.hasNext()) {
			Object r=lit.next();
			System.out.println(r);
		}
		System.out.println("<------backward");
		while(lit.hasPrevious()) {
			Object r=lit.previous();
			System.out.println(r);
		}
	}
}
