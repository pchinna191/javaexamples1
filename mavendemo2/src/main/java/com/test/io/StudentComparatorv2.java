package com.test.io;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class StudentComparatorv2 implements Comparator<Student> {
	@Override
    public int compare(Student stu1, Student stu2) {
        return new CompareToBuilder()
                .append(stu1.getEname(), stu2.getEname())
                .append(stu1.getFee(), stu2.getFee()).toComparison();
    }

	

}
