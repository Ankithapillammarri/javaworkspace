package com.capgemini.javafullstack.array;

public class MainMethod {
	public static void main(String[] args) {
		
		int[] a=new int[5];

		a[0]=24;
		a[1]=6;
		a[2]=9;
		a[3]=20;
		a[4]=15;
		
		TestArray7 t=new TestArray7();
		t.displayArray(a);
		
		String[] s=new String[4];

		s[0]="anki";
		s[1]="pranu";
		s[2]="sonu";
		s[3]="manu";
		
		t.displayStringArray(s);

	}
}
