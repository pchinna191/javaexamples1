package com.test.io;
import java.util.Comparator;

public class NameSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return (s1.getEname().compareTo(s2.getEname()));
	}

}
