package com.kn.ThreeDArrays;

import java.util.Scanner;

public class AdditionOfTwoJagged3DArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size =");
		int size1=scan.nextInt();
		
		
		
//		declaration and creation
		int[][][] arr=new int[size1][][];
		int[][][] brr=new int[size1][][];
		int[][][] crr=new int[size1][][];
		
		for(int i=0;i<size1;i++) {
			System.out.println("enter the i"+(i+1)+" size =");
			int size2=scan.nextInt();
			arr[i]=new int[size2][];
			brr[i]=new int[size2][];
			crr[i]=new int[size2][];
		}
		for(int i=0;i<size1;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the j" +(j+1)+" size =");
				int size3=scan.nextInt();
				arr[i][j]=new int[size3];
				brr[i][j]=new int[size3];
				crr[i][j]=new int[size3];
			}
		}
		
//		initialization
		for(int i=0;i<arr.length;i++) {
 			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("enter the  values for arr =");
				arr[i][j][k]=scan.nextInt();
			}
			}
		}
		System.out.println("******************************************************************");

		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				for(int k=0;k<brr[i][j].length;k++) {
					System.out.println("enter the values for  brr =");	
					brr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				for(int k=0;k<crr[i][j].length;k++) {
				
				crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
				}
			}
		}
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				for(int k=0;k<crr[i][j].length;k++){
				System.out.println("sum= " + crr[i][j][k]);
				
			}
			}
		}

	}

}
