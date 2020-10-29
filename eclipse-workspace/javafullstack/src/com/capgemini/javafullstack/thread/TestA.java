package com.capgemini.javafullstack.thread;

public class TestA {
	public static void main(String[] args) {
		
		Pen p=new Pen();
		p.start();
		
		Pen s=new Pen();
		s.start();
		
		System.out.println(p);
		System.out.println(s);
	}
}
