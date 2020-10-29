package com.capgemini.javafullstack.collection.set;

import java.util.Comparator;

public class StudentByPercentage implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.percentage>o2.percentage) {
			return 1;
			
		}else if(o1.percentage<o2.percentage) {
			return -1;
		}
		return 0;
	}

}
