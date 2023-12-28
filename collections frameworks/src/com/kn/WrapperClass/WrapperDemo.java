package com.kn.WrapperClass;

import java.util.*;

public class WrapperDemo {

	public static void main(String[] args) {

		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println("Elements = "+ l1);
		
		//Auto Unboxing 
		int i1=l1.get(0); //(int)l1.get(0);
		int i2=l1.get(1); //(int)l1.get(1);
		int i3=l1.get(2); //(int)l1.get(2);
		System.out.println("i1 =" + i1);
		System.out.println("i2 =" + i2);
		System.out.println("i3 =" + i3);
		
		
	}

}
