package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(5.6);
		al.add(9.4);
		al.add(2.9);
		al.add(6.3);
		
		for(int i=0;i<al.size();i++) {
			
			Double r=al.get(i);
			System.out.println(r);
		}
	}
}
