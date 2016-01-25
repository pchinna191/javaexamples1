package com.test.io;
import java.util.Comparator;

public class FeeSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.getFee()<s2.getFee()){
			return -1;
		}
		else if(s1.getFee()>s2.getFee()){
			return 1;
		
		}
		else
				return 0;
		
	}

}

