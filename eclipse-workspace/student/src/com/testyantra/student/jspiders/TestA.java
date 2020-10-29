package com.testyantra.student.jspiders;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestA {
	public static void main(String[] args) {
		 
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.println("Name is "+name);
		}catch(InputMismatchException im) {
			im.printStackTrace();
		}finally {
			System.out.println("we ended");
		}
	}
}
