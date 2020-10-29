package com.capgemini.javafullstack.singleton;

public class TestA {
	public static void main(String[] args) {
		
		
		Pen p=Pen.getPen();
		Pen r=Pen.getPen();
		
		System.out.println(p);
		System.out.println(r);
	}
}
