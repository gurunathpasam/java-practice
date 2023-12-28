package com.kn.arrays;

import java.util.Scanner;

public class SumOfElemenetsInArrayUsingMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size =");
		int[] arr=new int[scan.nextInt()];
		
		int sum=0;
		System.out.println(sumOfElements(arr,sum));
		scan.close();
	}

	private static int sumOfElements(int[] arr,int sum) {
		Scanner scan=new Scanner(System.in);

		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the value of "+(i+1)+"=");
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
		scan.close();
		return sum;
 
	}

}
