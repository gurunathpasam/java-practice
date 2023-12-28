package com.kn.arrays;

import java.util.Scanner;

public class OddArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the arrays size = ");
		int[] arr= new int[scan.nextInt()];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=k;
			k=k+1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
		}
		
		

	}

}
