package com.capgemini.javafullstack.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestD {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("PineApple", 40);
		hm.put("Apple", 50);
		hm.put("Grapes", 90);
		hm.put("Banana", 10);
		//to get only key
		Set<String> ts=hm.keySet();
		for(String k:ts) {
			System.out.println(k);
		}
		
			}
}
