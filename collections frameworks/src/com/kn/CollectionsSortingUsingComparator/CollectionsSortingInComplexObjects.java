package com.kn.CollectionsSortingUsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortingInComplexObjects {

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
				SortStudentById s=new SortStudentById();
				Collections.sort(l1,s);
				System.out.println("After Sorting ");
				System.out.println(l1);
			}


		
	}

