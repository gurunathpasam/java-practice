package com.kn.Traversing;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ReverseTraversingForDeque {

	public static void main(String[] args) {
		//BackWard Traversing 

		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(57);
		ad.add(96);
		ad.add(256);
		System.out.println(ad);

		//Using descendingIterator
		Iterator itr=ad.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
