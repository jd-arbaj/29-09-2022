package com.collection.bll;

import java.util.Comparator;

public class StateComparator implements Comparator<Student001> {

	


			@Override
			public int compare(Student001 std1, Student001 std2) {
				String state1 = std1.getState();
				String state2 = std2.getState();

				return state1.compareTo(state2);
				
			}

		}

