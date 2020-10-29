package com.capgemini.javafullstack.lamda;

import java.util.function.Function;

public class TestG {
	public static void main(String[] args) {
		
		Function<String,Integer> f=s->s.length();
		
		int res=f.apply("Priya");
		
		System.out.println("Result is "+res);
	}
}
