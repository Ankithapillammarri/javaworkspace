package com.capgemini.javafullstack.exception;

import java.io.File;
import java.io.IOException;

public class TestG {
	public static void main(String[] args) {
		
		
	System.out.println("Main started");
	
	File f=new File("Ankitha.txt");//File f=new File("z:/Ankitha.txt");
	try {
		f.createNewFile();
		System.out.println("File created");
	}catch(IOException e) {
		System.out.println("Sorry could not create the file");
	}
	System.out.println("Main ended");
	}
	
}
