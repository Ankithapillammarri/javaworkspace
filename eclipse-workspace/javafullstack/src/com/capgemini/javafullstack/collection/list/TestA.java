package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(5);
		al.add('p');
		al.add(2.4);
		al.add("divya");
		
		
		//int res=al.size();
		//System.out.println("Size is "+res);
		
		for(int i=0;i<al.size();i++) {  //for(int i=0;i<res;i++){
			Object r=al.get(i);
			System.out.println(r);
		}
	}
}
