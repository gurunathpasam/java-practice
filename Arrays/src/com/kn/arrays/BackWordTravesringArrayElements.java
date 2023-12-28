package com.kn.arrays;

import java.util.Scanner;

public class BackWordTravesringArrayElements {

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
		int[] crr=copyArrTobrr(arr,brr);
//		System.out.println("--->Initialization Done in main() ");
//		System.out.println("--->CopyArrayElements() called");

		for(int i=crr.length-1;i>=0;i--) {
			System.out.print(crr[i]+" ");
			}
		//		Copy Array elements from arr to brr
		}
	private static int[] copyArrTobrr(int[] arr, int[] brr) {
		for(int i=0;i<brr.length;i++){
		brr[i]=arr[i];
		}	
		return brr;

	}

}
