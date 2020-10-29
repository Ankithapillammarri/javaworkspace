package com.capgemini.javafullstack.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestA {
	public static void main(String[] args) {
		
		File f1=new File("anki.txt");
		
		String msg="Hi How are you";
		
		byte[] data=msg.getBytes();
		
		try (FileOutputStream fout=new FileOutputStream("anki.txt")){
			
			fout.write(data);
			System.out.println("Data is written into file");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
