package com.capgemini.javafullstack.collection.list;

import java.util.Comparator;

public class PersonByHeight implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.height>o2.height) {
			return 1;
		}else if(o1.height<o2.height) {
			return -1;
		}
		
		return 0;
		
	}

}
