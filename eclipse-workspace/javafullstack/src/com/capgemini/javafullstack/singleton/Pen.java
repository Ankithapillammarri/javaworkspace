package com.capgemini.javafullstack.singleton;

public class Pen {
	private final static Pen ref=new Pen();
	
		private Pen() {
			
		}
		public static Pen getPen() {
			return ref;
		}
			
}
