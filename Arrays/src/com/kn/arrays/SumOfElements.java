package com.kn.arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size =");
		int[] arr=new int[scan.nextInt()];
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the value of "+(i+1)+"=");
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
			
			
		}
		System.out.println(sum);

	}

}
