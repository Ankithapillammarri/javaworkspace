package com.capgemini.javafullstack.hasa;

public class TestP {
	public static void main(String[] args) {
		
		Singer.p.cost=100;
		Singer.p.draw();
		Singer s=new Singer();
		s.sing();
		s.age=22;
	}
}
