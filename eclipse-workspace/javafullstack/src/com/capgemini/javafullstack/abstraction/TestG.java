package com.capgemini.javafullstack.abstraction;

public class TestG {
	public static void main(String[] args) {

		Browser b=new Browser();
		//Gmail gm=new Gmail();
		//b.open(gm);
		
		GDrive gd=new GDrive();
		b.open(gd);



	}

}

