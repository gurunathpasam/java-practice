package com.kn.Traversing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseTraversingForList {

	public static void main(String[] args) {

		ArrayList<Integer> ad=new ArrayList<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);

		ListIterator<Integer> itr=ad.listIterator(ad.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());

		}
	}

}
