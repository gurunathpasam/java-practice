package com.kn.arrays;

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		declaration
		double[] arr;
//		creation
		System.out.println("enter the Array size =");
	
		arr=new double[scan.nextInt()];
//		initialization
		int k=1;
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=k;
			k=k+1;
		}
	
//		array traversing
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println(arr[i]);
			
		}
			scan.close();
		}

		}
		

	}

