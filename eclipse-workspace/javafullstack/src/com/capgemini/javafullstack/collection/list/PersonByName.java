package com.capgemini.javafullstack.collection.list;

import java.util.Comparator;

public class PersonByName implements Comparator<Person> {

	@Override
	public int compare(Person a1, Person a2) {
		return a1.name.compareTo(a2.name);
		
	}

}
