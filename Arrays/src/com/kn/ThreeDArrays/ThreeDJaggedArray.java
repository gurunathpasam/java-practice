package com.kn.ThreeDArrays;

import java.util.Scanner;

public class ThreeDJaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//		array declaration & creation 
		int[][][] arr=new int[2][][];
		arr[0]=new int[1][];
		arr[1]=new int[2][];
		
		arr[0][0]=new int[2];
		arr[1][0]=new int[3];
		arr[1][1]=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++){
				System.out.println("engter the data ");
				arr[i][j][k]=scan.nextInt();
				
			}
			}
		}
			
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++){
				System.out.println(arr[i][j][k]);
				
			}
			}
		}
		
	}
}
