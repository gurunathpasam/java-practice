package com.kn.ArrayList;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		System.out.println("Example 1: ");
		System.out.println(l1);
		System.out.println(l1.size());
		l1.add(100);
		l1.add(100);
		l1.add(10.5);
		l1.add("five");
		l1.add("True");
		l1.add('g');
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		System.out.println(l1.size());
		//get()
		System.out.println("4th index holding ="+l1.get(4));
		System.out.println("5th index"+l1.get(5));
		try {
			System.out.println("12th index holding" +l1.get(12));
		}catch(IndexOutOfBoundsException ae) {
			System.out.println("indexoutofbound exception  will come");
		}
		
		System.out.println("*********************************");
		
		System.out.println("Example 2:");
		ArrayList l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		System.out.println(l2);
		//add(index, element)
		l2.add(3, 1111); // insert the element at the specified index  
		System.out.println(l2);
		//set(index,element)
		l2.set(3, 33); //if you want to replace the 3rd index with different data
		System.out.println(l2);
		l2.add(10);
		System.out.println(l2);
		//indexOf()
		System.out.println("IndexOf(30) = " + l2.indexOf(30));
		System.out.println("IndexOf(10) = " + l2.indexOf(10));
		System.out.println("lastIndexOf (10) = " + l2.lastIndexOf(10));
		System.out.println("*******************************************");
		System.out.println("Example 3: ");
		ArrayList l3=new ArrayList();
		l3.add(10);
		l3.add(20);
		l3.add(30);
		l3.add(40);
		l3.add(50);
		System.out.println(l3);
		ArrayList l4=new ArrayList();
		l4.add("one");
		l4.add("two");
		l4.add("Three");
		l4.add("four");
		l4.add("five");
		System.out.println(l4);
		//if you want to add all l1 elements of specified collection at the end  
		l4.addAll(l3);  
		System.out.println(l4);
		//if you want to add all l1 elements of specified collection at the Specified index  
		l4.addAll(2, l3);
		System.out.println(l4);
		
		
		
		

		
		
		
	}

}
