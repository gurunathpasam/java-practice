package com.kn.arrays;

import java.util.Scanner;

public class AccessingIndexedElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array =");
//		declaration and creation
		int[] arr= new int[scan.nextInt()];
		accessingindexednumber(arr);
	}
		
	 public static void accessingindexednumber(int[] arr) {
		 
	 Scanner scan =new Scanner(System.in);
//	 initialization
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter the elements of array"+(i)+" =");
			arr[i]=scan.nextInt();
			
			
		}
		System.out.println("enter the index number =");
		int index=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(i==index) {
				System.out.println(arr[i]);
			}
		}
		

	

		
	}

}
