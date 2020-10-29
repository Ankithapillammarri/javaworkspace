package com.capgemini.javafullstack.collection.list;

import java.util.Comparator;

public interface MyPersonSort {
	
	Comparator<Person> p=(p1,p2)->{
		if(p1.id>p2.id) {
			return 1;
		}else if(p1.id<p2.id) {
			return -1;
		}
		return 0;
	};
	Comparator<Person> ComByHeight=(o1,o2)->{
			if(o1.height>o2.height) {
				return 1;
			}else if(o1.height<o2.height) {
				return -1;
			}
			
			return 0;
			
		};
		Comparator<Person> ComByName=(a1,a2)->{
				return a1.name.compareTo(a2.name);
		
};


}

	
	

	
	


