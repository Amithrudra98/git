package com.te.practice.assignment;

import java.util.Comparator;

public class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}

}
