package com.kn.ArrayList;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);

		l1.add(1, 11);
		System.out.println(l1);

		l1.set(1,22);
		System.out.println(l1);

		l1.add(10);

		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println("indexOf(10) = "+ l1.indexOf(10));
		System.out.println("LastIndexOf(10) = "+ l1.lastIndexOf(10));

		System.out.println("***********************");
		LinkedList l2=new LinkedList();
		l2.add("Ten");
		l2.add("Twenty");
		l2.add("Thirty");
		System.out.println(l2);

		l2.addAll(l1);
		System.out.println(l2);
		l2.addAll(2, l1);
		System.out.println(l2);
	}

}
