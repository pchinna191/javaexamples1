package com.test.io;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentChainedComparators implements Comparator<Student>{
	private List<Comparator<Student>> listComparators;
	 
    @SafeVarargs
    public StudentChainedComparators(Comparator<Student>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }

	@Override
	public int compare(Student stu1, Student stu2) {
		for (Comparator<Student> comparator : listComparators) {
            int result = comparator.compare(stu1, stu2);
            if (result != 0) {
                return result;
            }
        }
		return 0;
	}


	
}
