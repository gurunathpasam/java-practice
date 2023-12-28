package com.kn.ThreeDArrays;

import java.util.Scanner;

public class AdditionOf3DArrays {

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
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				for(int k=0;k<brr[i][j].length;k++) {
					System.out.println("enter the brr["+i+"]["+j+"]["+k+"] =");	
					brr[i][j][k]=scan.nextInt();
				}
			}
		}
			findTwo3DArrayElementMultiplication(arr,brr);
			scan.close();

		}
		
		 static void findTwo3DArrayElementMultiplication(int[][][] arr, int[][][] brr) {
			int[][][] crr=new int[arr.length][arr[0].length][arr[0][0].length];
			for(int i=0;i<crr.length;i++) {
				for(int j=0;j<crr[i].length;j++) {
					for(int k=0;k<crr[i][j].length;k++) {
					
					crr[i][j][k]=arr[i][j][k]*brr[i][j][k];
					}
				}
			}
			for(int i=0;i<crr.length;i++) {
				for(int j=0;j<crr[i].length;j++) {
					for(int k=0;k<crr[i][j].length;k++){
					System.out.println("product= " + crr[i][j][k]);
					
					}
				}
			}
			
		}

	}
