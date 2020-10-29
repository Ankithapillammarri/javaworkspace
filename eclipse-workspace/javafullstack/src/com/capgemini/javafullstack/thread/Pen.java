package com.capgemini.javafullstack.thread;

public class Pen extends Thread {

		@Override
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
		}
		
		 
}
