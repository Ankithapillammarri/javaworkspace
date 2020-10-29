package com.capgemini.javafullstack.collection.set;

import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(120);
		ts.add(98);
		ts.add(43);
		ts.add(55);
		
		for(Object r:ts) {
			System.out.println(r);
		}
	}
}
