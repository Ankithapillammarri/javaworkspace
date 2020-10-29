package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestH {
	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(5.6);
		al.add(9.4);
		al.add(2.9);
		al.add(6.3);
		
		for(Double r:al) {
			System.out.println(r);
		}
	}
}
