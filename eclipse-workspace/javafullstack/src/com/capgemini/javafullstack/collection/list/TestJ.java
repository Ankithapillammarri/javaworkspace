package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestJ {
	public static void main(String[] args) {


		ArrayList<Double> al=new ArrayList<Double>();
		al.add(5.6);
		al.add(9.4);
		al.add(2.9);
		al.add(6.3);

		ListIterator<Double> lit=al.listIterator();
		System.out.println("------>forward");
		while(lit.hasNext()) {
			Double r=lit.next();
			System.out.println(r);
		}
		System.out.println("<-----Backward");
		while(lit.hasPrevious()) {
			Double r=lit.previous();
			System.out.println(r);
		}
	}
}
