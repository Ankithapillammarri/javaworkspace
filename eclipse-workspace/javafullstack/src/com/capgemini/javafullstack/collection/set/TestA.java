package com.capgemini.javafullstack.collection.set;

import java.util.HashSet;

public class TestA {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("Ramu");
		hs.add(2.4);
		hs.add('A');
		hs.add(15);
		
		for(Object r:hs) {
			System.out.println(r);
		}
	}
}
