package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();

		al.add(5);
		al.add('p');
		al.add(2.4);
		al.add("divya");
		
		for(Object r:al) {
			System.out.println(r);
		}
	}
}
