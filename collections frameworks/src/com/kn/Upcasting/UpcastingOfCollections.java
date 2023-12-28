package com.kn.Upcasting;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class UpcastingOfCollections {

	public static void main(String[] args) {
		List l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List l2=new ArrayList<>();
		l2.add(70);
		l2.add(80);
		l2.add(20);
		
		Queue q1=new ArrayDeque<>();
		q1.add(11);
		q1.add(22);
		q1.add(33);
		
		Queue q2=new ArrayDeque<>();
		q2.add(99);
		q2.add(88);
		q2.add(77);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(q1);
		System.out.println(q2);
		
		
		

	}

}
