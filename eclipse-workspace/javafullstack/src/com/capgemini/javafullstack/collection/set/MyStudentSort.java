package com.capgemini.javafullstack.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public interface MyStudentSort {

		
	

	Comparator<Student> c1=(o1,o2)->{
		if(o1.id>o2.id) {
			return 1;
			
		}else if(o1.id<o2.id) {
			return -1;
		}
		return 0;
	};
	
	Comparator<Student> c2=(o1,o2)->{
			if(o1.percentage>o2.percentage) {
				return 1;
				
			}else if(o1.percentage<o2.percentage) {
				return -1;
			}
			return 0;
		};
		Comparator<Student> c3=(o1,o2)->{

			return o1.name.compareTo(o2.name);
		};
		
	
}
