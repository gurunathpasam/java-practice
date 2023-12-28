package com.kn.TwoDArrays;

import java.util.Scanner;

public class AdditionOfTwo2DArraysUsingMethods {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the i size =");
		int size1=scan.nextInt();
		System.out.println("enter the j size =");
		int size2=scan.nextInt();
		
//		declaration and creation
		int[][] arr=new int[size1][size2];
		int[][] brr=new int[size1][size2];
//		initialization
		System.out.println("enter the values for arr array :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the "+(j+1)+"values =");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the values for brr array :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the "+(j+1)+"values =");
				brr[i][j]=scan.nextInt();
			}
		}
		findTwo2DArrayElementSum(arr,brr);
		scan.close();

	}

	 static void findTwo2DArrayElementSum(int[][] arr, int[][] brr) {
		int[][] crr=new int[arr.length][arr[0].length]; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				crr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("sum= " + crr[i][j]);
				
			}
		}
		
	}

}
