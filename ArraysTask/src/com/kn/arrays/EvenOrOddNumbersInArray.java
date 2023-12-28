package com.kn.arrays;

import java.util.Scanner;

public class EvenOrOddNumbersInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		declaration creation
		System.out.println("enter the Array size =");
		int[] arr=new int[scan.nextInt()];
//		//		initialization
		
		for(int i=0 ;i<arr.length;i++) {
			System.out.print("Enter the Elements=" );
			arr[i]=scan.nextInt();
		}
		evenOrOdd(arr);
	}
//		

	private static void evenOrOdd(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println("Even numbers="+arr[i]);
				}
			else {
				System.out.println("Odd numbers="+arr[i]);

			}
			}
		
	}
		

	}

