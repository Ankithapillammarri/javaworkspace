package com.capgemini.javafullstack.lamda;
import java.util.function.Predicate;
public class TestE {
	public static void main(String[] args) {
		
		Predicate<Integer> p=(a)->a%2==0;
		
		boolean res=p.test(11);
		
		System.out.println("Result is "+res);
	}
}
