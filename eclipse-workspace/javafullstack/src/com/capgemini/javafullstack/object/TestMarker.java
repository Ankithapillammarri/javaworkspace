package com.capgemini.javafullstack.object;

public class TestMarker {
	public static void main(String[] args) {
		
		Marker m=new Marker();
		m.cost=90;
		m.color="red";
		
		Marker n=new Marker();
		n.cost=90;
		n.color="red";
		
		System.out.println(m.equals(n));
	}
}
