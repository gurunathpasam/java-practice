package com.kn.arrays;

import java.util.Scanner;

public class IsElementInTheArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array =");
		//declaration
		int[] arr;
		//creation
		arr=new int[scan.nextInt()];
//		initialization
		for(int i=0;i<arr.length;i++) {
		System.out.print("enter the value of "+(i+1)+"=");
		arr[i]=scan.nextInt();
	
	}
		System.out.println("enter the Element =");
		int element=scan.nextInt();
		boolean flag= isElementInTheArray(arr,element);
		if(flag) {
		System.out.println("--->given number is found an array<---");
			
		}
		else {
			System.out.println("given number is not found in the array");
		}
	}
	private static boolean isElementInTheArray(int[] arr,int element) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return true;
			}
		}
		return false;

}
}
