package com.capgemini.javafullstack.collection.list;

import java.util.Comparator;

public class PersonById implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.id>p2.id) {
			return 1;
		}else if(p1.id<p2.id) {
			return -1;
		}
		return 0;
	}

}
