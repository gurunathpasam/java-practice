package com.kn.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.add(10);
		p1.add(20);
		p1.add(30);
		p1.add(40);
		p1.add(50);
		p1.add(6);
		//p1.add("Ten");//java.lang.ClassCastException: 
						//class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader
		System.out.println(p1);
		
		PriorityQueue p2=new PriorityQueue();
		p2.add("Two");
		p2.add("Twenty");
		p2.add("Thirty");
		System.out.println(p2);

	}

}
