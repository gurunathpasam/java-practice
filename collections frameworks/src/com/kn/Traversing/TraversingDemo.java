package com.kn.Traversing;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingDemo {

	public static void main(String[] args) {
		ArrayList<Object> l1=new ArrayList<>();
		l1.add("Shirt");
		l1.add("Jeans");
		l1.add("Cap");
		
		//1.Using for loop
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("*****************");
		
		//2.Using for-each loop
		for(Object s:l1) {
			System.out.println(s);
		}
		
		System.out.println("*********************");
		
		//3.Using Iterator
		Iterator itr =l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
