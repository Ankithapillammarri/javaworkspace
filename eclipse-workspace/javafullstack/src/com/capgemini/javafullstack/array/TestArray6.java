package com.capgemini.javafullstack.array;

public class TestArray6 {
	public static void main(String[] args) {
		
		char[] c= {'A','P','P','L','E'};
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		//for reverse order//for(int i=c.length-1;i>=0;i--) {
						//	System.out.println(c[i]);
		//}
		System.out.println(".............");
		
		for(char s:c) {
			System.out.println(s);
		}
	}
}
