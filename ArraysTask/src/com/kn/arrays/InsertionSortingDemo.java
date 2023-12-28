package com.kn.arrays;

import java.util.Scanner;

public class InsertionSortingDemo {

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
		System.out.println("Before  the Insertion Sorted :");
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.println("]");
		System.out.println();
		
		InsertionSorting s1=new InsertionSorting();
		int[] brr=s1.sorting(arr);
		
		System.out.println("After the  Insertion Sorted :");
		System.out.print("[");
		for(int i: brr) {
			System.out.print(i+ " ");
			
		}
		System.out.println("]");
		



	}

}
