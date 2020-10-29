package com.capgemini.javafullstack.collection.list;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class TestProduct {
	public static void main(String[] args) {
		
		ArrayList<Product> al=new ArrayList<Product>();
		
		Product p1=new Product(6, "Radio", 7000);
		Product p2=new Product(1, "Bottle", 6000);
		Product p3=new Product(2, "Projector", 9000);
		Product p4=new Product(3, "Car", 8000);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		Collections.sort(al);
		Iterator<Product> it=al.iterator();
		while(it.hasNext()) {
			Product p=it.next();
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.price);
			System.out.println("---------------");
					
		}
	}
}
