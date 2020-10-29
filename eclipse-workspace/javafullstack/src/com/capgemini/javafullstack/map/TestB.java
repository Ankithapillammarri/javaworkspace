package com.capgemini.javafullstack.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestB {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hm=new LinkedHashMap<String, Integer>();
		hm.put("PineApple", 40);
		hm.put("Apple", 50);
		hm.put("Grapes", 90);
		hm.put("Banana", 10);

		for(Map.Entry<String, Integer> e:hm.entrySet()) {
			String k=e.getKey();
			Integer v=e.getValue();
			System.out.println(k+"------->"+v);
		}
	}
}
