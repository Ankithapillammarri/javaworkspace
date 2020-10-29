package com.capgemini.javafullstack.array;

public class TestArray {
	public static void main(String[] args) {

		int[] a=new int[5];

		a[0]=24;
		a[1]=6;
		a[2]=9;
		a[3]=20;
		a[4]=15;

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
