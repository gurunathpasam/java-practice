package com.kn.TwoDArrays;

import java.util.Scanner;

public class MultiplicationAndAdditionOfTwoArraysUsingMethods {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size =");
		int size=scan.nextInt();
//		array declaration &creation
		int[] arr=new int[size];
		int[] brr=new int[size];
		int[] crr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the "+(i+1)+"value for arr array=");
			arr[i]=scan.nextInt();
		}
		System.out.println("************************************");
		for(int i=0;i<brr.length;i++) {
			System.out.println("enter the "+(i+1)+"value for brr array=");
			brr[i]=scan.nextInt();
		}
		findTwoArrayElementSum(arr,brr,crr);
		findTwoArrayElementProduct(arr,brr,crr);
		scan.close();
	}
 
//		initialization
		

	 static void findTwoArrayElementSum(int[] arr,int[] brr,int[] crr) {
		
//		array traversion
		
		for(int i=0;i<crr.length;i++) {
			crr[i]=arr[i]+brr[i];
		}
		 System.out.println("-------------> addition <---------------");
		 System.out.println("the sum of values in arr and brr arrays ");
		for(int i=0;i<crr.length;i++) {
			System.out.println("sum = "+ crr[i]);
		}
		
	}
	 static void findTwoArrayElementProduct(int[] arr, int[] brr, int[] crr) {
		 for(int i=0;i<crr.length;i++) {
				crr[i]=arr[i]*brr[i];
			}
		 System.out.println("-------------> multiplication<---------------");
		 System.out.println("the product of values in arr and brr arrays ");
			for(int i=0;i<crr.length;i++) {
				System.out.println("product= "+ crr[i]);
			}
			
		}

}