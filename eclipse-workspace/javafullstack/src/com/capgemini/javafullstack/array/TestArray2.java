package com.capgemini.javafullstack.array;

public class TestArray2 {
	public static void main(String[] args) {

		String[] s=new String[4];

		s[0]="anki";
		s[1]="pranu";
		s[2]="sonu";
		s[3]="manu";

		//for(int i=0;i<s.length;i++) {
			//System.out.println(s[i]);
			
		for(String d:s) {
			System.out.println(d);
		}
		//}
	}
}