package com.kn.arrays;

import java.util.Scanner;

public class BubbleSortNonStatic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size=scan.nextInt();
		//Declaration and Creation 
		int[] arr=new int[size];
//		initialization 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Element"+(i+1)+"=");
			arr[i]=scan.nextInt();
		}
		System.out.println("Before The Sorted :");
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.print("]");
		System.out.println(" ");

//		Method Calling For Sorting 
		BubbleSortNonStaticDemo s1=new BubbleSortNonStaticDemo();
		int crr[]=s1.sort(arr);
		
		System.out.println("After the Sorted :");
		System.out.print("[");
		for(int i: crr) {
			System.out.print(i+ " ");
		}
		System.out.print("]");

		

	}

}
