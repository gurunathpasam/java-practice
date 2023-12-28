package com.kn.TwoDArrays;

import java.util.Scanner;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size =");
		int size=scan.nextInt();
//		array declaration &creation
		int[] arr=new int[size];
		int[] brr=new int[size];
		int[] crr=new int[size];
//		initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the "+(i+1)+"value for arr array=");
			arr[i]=scan.nextInt();
		}
		System.out.println("************************************");
		for(int i=0;i<brr.length;i++) {
			System.out.println("enter the "+(i+1)+"value for brr array=");
			brr[i]=scan.nextInt();
		}
//		array traversion
		for(int i=0;i<crr.length;i++) {
			crr[i]=arr[i]+brr[i];
		}
		System.out.println("the sum of values in arr and brr arrays = ");
		for(int i=0;i<crr.length;i++) {
			System.out.println("sum = "+ crr[i]);
		}
				
		
		

	}

}
