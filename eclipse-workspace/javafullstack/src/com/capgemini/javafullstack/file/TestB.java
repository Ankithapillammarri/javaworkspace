package com.capgemini.javafullstack.file;

import java.io.FileWriter;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		
		String msg="Hi how are you its new";
		char ch[]=msg.toCharArray();
		
		try (FileWriter fw=new FileWriter("anki.txt")){
		
			fw.write(ch);
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
