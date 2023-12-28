package com.kn.arrays;

import java.util.Scanner;

public class PrintTheElementsInArray{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		declaration
		double[] arr;
//		creation
		System.out.println("enter the Array size =");
	
		arr=new double[scan.nextInt()];
//		initialization
		int k=10;
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=k;
			k=k+10;
		}
	
//		array traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
//		
		scan.close();
			
		}
		

	}

