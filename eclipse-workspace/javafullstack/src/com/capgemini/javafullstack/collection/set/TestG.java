package com.capgemini.javafullstack.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestG {
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("anki");
		ts.add("pranu");
		ts.add("deepu");
		ts.add("manu");
		
		Iterator<String> it=ts.iterator();
		while(it.hasNext()) {
			String r=it.next();
			System.out.println(r);
		}
	}
}
