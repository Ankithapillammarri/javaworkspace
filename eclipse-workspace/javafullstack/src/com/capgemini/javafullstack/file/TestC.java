package com.capgemini.javafullstack.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestC {
	public static void main(String[] args) {
		
		try(FileInputStream fin=new FileInputStream("anki.txt")) {
			
			
		int x=0;
		
		while( (x=fin.read())!=-1) {
			System.out.println((char)x);
		}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
