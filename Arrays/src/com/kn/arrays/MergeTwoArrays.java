package com.kn.arrays;

import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first Array size = ");
		int size1=scan.nextInt();
		System.out.println("Enter the second  Array size = ");
		int size2=scan.nextInt();
//		declaration and creation 
		int[] arr=new int[size1];
		int[] brr=new int[size2];
//		initialization of arr and brr 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements for arr Array ");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter the elements for brr Array ");
			brr[i]=scan.nextInt();
		}
//		method for merging two arrays
		int[] crr=mergeArrays(arr,brr);
//		traversing
		System.out.print("Merged array elements : ");
		for(int i : crr) {
			System.out.print(i +" ");
		}
		scan.close();
	}
//	method called
	public static int[] mergeArrays(int[] arr, int[] brr) {
		int[] crr=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<crr.length;i++) {
			crr[i]=brr[j];
			j++;
		}
		return crr;
		
		
		
	}

}
