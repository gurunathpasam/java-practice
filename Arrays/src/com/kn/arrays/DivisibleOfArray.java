package com.kn.arrays;

import java.util.Scanner;

public class DivisibleOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		declaration and creation
		System.out.println("enter the size of array =");
		int[] arr=new int[scan.nextInt()];
//		initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the value of "+(i+1)+"= ");
			arr[i]=scan.nextInt();
			
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0) {
				System.out.print(arr[i]+",");
			}
			else {
				System.out.println("given number "+arr[i]+" in an array  not divisible by 5 ");
			}
		}
		

	}

}
