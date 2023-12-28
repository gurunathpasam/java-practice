package com.kn.CollectionSortingOfSimpleObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsSortingInSimpleObjects {

	public static void main(String[] args) {
		//Sorting using TreeSet
		TreeSet<Integer>  set=new TreeSet<Integer>();
		set.add(10);
		set.add(35);
		set.add(74);
		set.add(8);
		set.add(725);
		System.out.println("Using Sorting "+ set);
		
		//Sorting using collections.sort(Obj)
		
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(756);
		l1.add(39);
		l1.add(61);
		l1.add(28);
		System.out.println("List Before sorting "+ l1);
		Collections.sort(l1);
		System.out.println("After Sorting "+ l1);
		
		
		
	}
}
