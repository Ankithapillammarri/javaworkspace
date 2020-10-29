package com.capgemini.javafullstack.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestE {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("PineApple", 40);
		hm.put("Apple", 50);
		hm.put("Grapes", 90);
		hm.put("Banana", 10);
		
		Integer s=hm.get("Apple");
		System.out.println(s);
		//boolean res=hm.containsKey("Apple");
		//System.out.println(res);
		//boolean res=hm.containsValue(10);
		//System.out.println(res);
		
		//Collection<Integer> cs=hm.values();
		
		//Iterator<Integer> it=cs.iterator();
		//while(it.hasNext()) {
			//Integer k=it.next();
			//System.out.println(k);
		
		
			}
}
