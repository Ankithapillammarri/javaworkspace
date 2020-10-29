package com.capgemini.javafullstack.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestE {
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("anki");
		lhs.add("pranu");
		lhs.add("manu");
		lhs.add("deepu");
		
		
		System.out.println("******Using for-each*******");
		for(String r:lhs) {
			System.out.println(r);
		}
		System.out.println("******Using Iterator*****");
		Iterator<String> it=lhs.iterator();
		while(it.hasNext()) {
			String r=it.next();
			System.out.println(r);
		}
	}
}
