package com.kn.arrays;

import java.util.Scanner;

public class AdditionOfTwo1DArrayElements {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size =");
		int size=scan.nextInt();
//		array declaration &creation
		int[] arr=new int[size];
		int[] brr=new int[size];
		int[] crr=new int[size];
//		Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+"value for arr array=");
			arr[i]=scan.nextInt();
		}
		System.out.println("************************************");
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter the "+(i+1)+"value for brr array=");
			brr[i]=scan.nextInt();
		}
//		method calling 
		crr=addition(arr,brr,crr);
		System.out.println("The sum of values in arr and brr arrays = ");
		for(int i=0;i<crr.length;i++) {
			System.out.println("arr["+i+"]+brr["+i+"]"+"="+ crr[i]);
		}
		scan.close();	
	}
	private static int[] addition(int[] arr,int[] brr,int[] crr) {
//		array Traversion
		for(int i=0;i<crr.length;i++) {
			crr[i]=arr[i]+brr[i];
		}
		return crr;
	}
}
