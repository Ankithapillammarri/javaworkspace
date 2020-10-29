package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestI {
	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(5.6);
		al.add(9.4);
		al.add(2.9);
		al.add(6.3);
		
		Iterator<Double> it=al.iterator();
		while(it.hasNext()) {
			Double r=it.next();
			System.out.println(r);
			//System.out.println(al);
		}
			}
}
