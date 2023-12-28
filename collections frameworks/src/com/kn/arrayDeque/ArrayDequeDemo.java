package com.kn.arrayDeque;
import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque d1=new ArrayDeque();
		
		d1.add(10);
		d1.add(10);
		d1.add(20.5); 
		d1.add("thirty");
		d1.add(true);
		System.out.println(d1);
		System.out.println("First = "+ d1.getFirst());
		System.out.println("Last = "+ d1.getLast());
		
		d1.addFirst("Gurunath");
		d1.addLast("Pasam");
		System.out.println(d1);
		System.out.println("First = "+ d1.getFirst());
		System.out.println("Last = "+ d1.getLast());
		
	}

}
