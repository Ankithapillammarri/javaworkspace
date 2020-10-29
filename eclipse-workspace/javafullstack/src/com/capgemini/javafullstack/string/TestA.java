package com.capgemini.javafullstack.string;

public class TestA {
	public static void main(String[] args) {
		
		String n="Hi how are you";
		
		String[] ar=n.split(" ");
		
		for(String s:ar) {
			System.out.println(s);
		}
	}
}
