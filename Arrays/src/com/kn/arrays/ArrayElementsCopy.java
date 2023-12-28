package com.kn.arrays;

import java.util.Scanner;

public class ArrayElementsCopy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size =");
		int size=scan.nextInt();
		
//		declaration & creation 
		int[] arr=new int[size];
		int[] brr=new int[size];
//		 initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the elements "+(i+1)+"=");
			arr[i]=scan.nextInt();
		}
//		Copy Array elements from arr to brr
		System.out.print("elements in the brr array is =");

		for(int i=0;i<arr.length;i++){
		brr[i]=arr[i];
		System.out.print(brr[i]+" ");
		}
	}

}
