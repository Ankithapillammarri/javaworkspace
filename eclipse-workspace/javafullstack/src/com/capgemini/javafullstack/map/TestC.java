package com.capgemini.javafullstack.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestC {
	public static void main(String[] args) {

		TreeMap<String, Integer> hm=new TreeMap<String, Integer>();
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
