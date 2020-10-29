package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println("For Arraylist");
		al.add(5);
		al.add('p');
		al.add(2.4);
		al.add("divya");
		
		for(Object r:al) {
			System.out.println(r);
		}
		System.out.println("For Iterator");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
	}
}
