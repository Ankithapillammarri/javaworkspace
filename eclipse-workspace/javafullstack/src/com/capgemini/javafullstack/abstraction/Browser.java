package com.capgemini.javafullstack.abstraction;

public class Browser {
	void open(Google g) {
		g.login();
		g.sendMail();
	}
}
