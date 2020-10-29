
package com.capgemini.javafullstack.abstraction;

public abstract class Google {
	public void login() {
		System.out.println("Authenticate the user");
	}
	public abstract void sendMail(); 
}
