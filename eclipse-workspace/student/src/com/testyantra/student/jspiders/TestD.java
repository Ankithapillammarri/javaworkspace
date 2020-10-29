package com.testyantra.student.jspiders;

import java.util.Scanner;

public class TestD {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the name");
		String name=sc.nextLine();

		System.out.println("Enter the age");
		int age=sc.nextInt();

		System.out.println("Enter the height");
		double height=sc.nextDouble();
		
		sc.close();

		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Height is "+height);
	}
}
