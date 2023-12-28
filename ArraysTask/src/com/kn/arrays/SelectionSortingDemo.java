package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortingDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the size of the Array : ");
		int size=scan.nextInt();
		//Declaration and Creation 
		int[] arr=new int[size];
//		initialization 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Element"+(i+1)+"=");
			arr[i]=scan.nextInt();
		}
		System.out.println("Before  the Selection Sorted :");
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.println("]");
		System.out.println();
		
		SelectingSorting s1=new SelectingSorting();
		int[] brr=s1.sorting(arr);
		
		System.out.println("After the  Selection Sorted :");
		System.out.print("[");
		for(int i: brr) {
			System.out.print(i+ " ");
			
		}
		System.out.println("]");
		


	}

}
