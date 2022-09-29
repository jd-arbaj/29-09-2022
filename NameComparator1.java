package com.collection.bll;

import java.util.Comparator;

public class NameComparator1 implements Comparator<Student001>  {

	


			@Override
			public int compare(Student001 std1, Student001 std2) {
				String name1 = std1.getStudentName();
				String name2 = std2.getStudentName();

				return name1.compareTo(name2);
				
			}

		}

