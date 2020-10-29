package com.capgemini.javafullstack.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestA {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(7);
		p.add(10);
		p.add(2);
		p.add(89);
		p.add(16);
		
		System.out.println("******Using for each loop******");
		for(Integer i:p ) {
			System.out.println(i);
			
		}
		System.out.println("******Using Iterator*****");
		Iterator<Integer> it=p.iterator();
		while(it.hasNext()) {
			Integer r=it.next();
			System.out.println(r);
		}
	}
}
