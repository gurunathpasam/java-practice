package com.kn.arrays;

import java.util.Scanner;

public class ArrayStringUserInput {

	public static void main(String[] args) {
//		declaration
		String[] arr;
//		creation
		Scanner scan=new Scanner(System.in);
		
		arr=new String[scan.nextInt()];
//		initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the array of "+(i+1)+"=");
			arr[i]=scan.next();
		}
//		array traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		scan.close();

		
		
		

	}

}
