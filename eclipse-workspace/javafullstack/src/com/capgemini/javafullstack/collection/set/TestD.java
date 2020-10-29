package com.capgemini.javafullstack.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(5);
		lhs.add(1);
		lhs.add(4);
		lhs.add(8);
		
		System.out.println("******Using for-each*******");
		for(Object r:lhs) {
			System.out.println(r);
		}
		System.out.println("******Using Iterator*****");
		Iterator it=lhs.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
		
	}
}
