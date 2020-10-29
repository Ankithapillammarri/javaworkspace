package com.capgemini.javafullstack.lamda;

import java.util.function.Function;

public class TestF {
	public static void main(String[] args) {
		
		
		//Function<InputType,returnType>
		Function<Integer,Double> f=(r)->3.14*r*r;
		double res=f.apply(5);
		
		System.out.println("Result is "+res);
		
		
	}
}
