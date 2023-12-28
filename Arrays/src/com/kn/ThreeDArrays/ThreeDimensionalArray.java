package com.kn.ThreeDArrays;

import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the i size =");
		int size1=scan.nextInt();
		System.out.println("enter the j size =");
		int size2=scan.nextInt();
		System.out.println("enter the k size =");
		int size3=scan.nextInt();
		
//		declaration and creation
		int[][][] arr=new int[size1][size2][size3];
		int[][][] brr=new int[size1][size2][size3];
//		initialization
		for(int i=0;i<arr.length;i++) {
 			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the arr["+i+"]["+j+"]["+k+"] =");
				arr[i][j][k]=scan.nextInt();
			}
			}
		}
// 			Array Traversing 
		System.out.println("Array elements are as follows :");
 			for(int i=0;i<arr.length;i++) {
 	 			for(int j=0;j<arr[i].length;j++) {
 					for(int k=0;k<arr[i][j].length;k++) {
 					System.out.print(arr[i][j][k]+" ");
 					}
 	 			}
 			}
		}
 			

	}


