package com.kn.TwoDArrays;

public class TwoDJoggedArray {

	public static void main(String[] args) {
//		Array dDeclaration & cCreation 
		int[][] arr=new int[2][];
		arr[0]=new int[4];
		arr[1]=new int[2];
//		Array Initialization
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		arr[1][0]=50;
		arr[1][1]=60;
//		Array Traversing
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
