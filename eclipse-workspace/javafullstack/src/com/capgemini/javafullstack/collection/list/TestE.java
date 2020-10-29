package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();

		al.add(5);
		al.add('p');
		al.add(2.4);
		al.add("divya");
		
		ListIterator lit=al.listIterator(al.size());
		System.out.println("<------backward");
		while(lit.hasPrevious()) {
			Object r=lit.previous();
			System.out.println(r);
	}
	}
}
