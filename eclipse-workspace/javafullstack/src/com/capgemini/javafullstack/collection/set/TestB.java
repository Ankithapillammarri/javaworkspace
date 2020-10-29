package com.capgemini.javafullstack.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("Ramu");
		hs.add(2.4);
		hs.add('A');
		hs.add(15);
		
		Iterator it=hs.iterator();
		while(it.hasNext());
		Object r=it.next();
		System.out.println(r);
		

	}
}
