package com.kn.CollectionsSortingUsingComparatorType2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1=new Student(11, "ABC", 73.5);
		Student s2=new Student(13, "XYZ", 53.5);
		Student s3=new Student(12, "PQR", 36.5);

		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3);
		ArrayList<Student> l1=new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		System.out.println("Before Sorting ");
		System.out.println(l1);



		//Another method without using another class
		Collections.sort(l1,new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if(s1.getId() > s2.getId()) {
					return 1;
				}
				else if( s1.id< s2.id) {
					return -1;
				}
				else {
					return 0;
				}

			}
		}
				);
		System.out.println("After Sorting based on Id ");
		System.out.println(l1);

		//Sorting based on name
		System.out.println("After Sorting Based on Name ");
		Collections.sort(l1, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());

			}

		});
		System.out.println(l1);

		//Sorting based on percentage
		Collections.sort(l1, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if(s1.getPercentage() > s2.getPercentage()){
					return 1;
				}else if(s1.getPercentage() < s2.getPercentage()) {
					return -1;
				}else {
					return 0;
				}

			}
		});
		System.out.println("After Sorting Based on percentage ");
		System.out.println(l1);






		}
	}
