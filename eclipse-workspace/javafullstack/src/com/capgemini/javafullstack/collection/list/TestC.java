package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();

		al.add(5);
		al.add('p');
		al.add(2.4);
		al.add("divya");
		
		Iterator it=al.iterator();
		
		Object i=it.next();
		Object j=it.next();
		Object k=it.next();
		Object m=it.next();
		it.next();/*while(it.hasNext()) {  
			Object r=it.next();
			System.out.println(r);*/
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
