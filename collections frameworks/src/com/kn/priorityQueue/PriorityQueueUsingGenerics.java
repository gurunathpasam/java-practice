package com.kn.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueUsingGenerics {

	public static void main(String[] args) {
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(10);
		p1.add(20);
		p1.add(30);
		p1.add(40);
		p1.add(50);
		p1.add(6);
		//p1.add("Ten");
		System.out.println(p1);

		PriorityQueue<String> p2=new PriorityQueue<String>();
		p2.add("Two");
		p2.add("Twenty");
		p2.add("Thirty");
		System.out.println(p2);
		
		PriorityQueue<Boolean> p3=new PriorityQueue<Boolean>();
		p3.add(true);
		p3.add(false);
		System.out.println(p3);
		
		PriorityQueue<Character> p4=new PriorityQueue<Character>();
		p4.add('g');
		p4.add('u');
		p4.add('r');
		p4.add('u');
		System.out.println(p4);
		
		PriorityQueue<Double> p5=new PriorityQueue<Double>();
		p5.add(10.0);
		p5.add(20.5);
		p5.add(30.7);
		p5.add(40.78);
		System.out.println(p5);




	}

}
