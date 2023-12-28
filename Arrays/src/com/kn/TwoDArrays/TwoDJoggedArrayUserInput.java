package com.kn.TwoDArrays;
import java.util.Scanner;
public class TwoDJoggedArrayUserInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Array Declaration & Creation 
		int[][] arr=new int[2][];
		arr[0]=new int[4];
		arr[1]=new int[2];
//		Array Initialization
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the values of=");
			arr[i][j]=scan.nextInt();
			}
		}
		
//		Array Traversing
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
