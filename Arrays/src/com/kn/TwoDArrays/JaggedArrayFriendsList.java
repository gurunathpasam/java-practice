package com.kn.TwoDArrays;

import java.util.Scanner;

public class JaggedArrayFriendsList {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the batches =");
		int batch =scan.nextInt();
		
		//Array Declaration & Creation 
		
		String [][] arr=new String[batch][];
		for(int i=0;i<batch;i++) {
			System.out.println("enter the 2D size =");
			arr[i]=new String[scan.nextInt()];
			}
	//		Array Initialization
		for(int i=0;i<batch;i++) {
			System.out.println("btach"+(i+1)+"class friends :");
			System.out.println("I have "+arr[i].length+" friends ");
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the names  of "+(j+1)+" for batch "+ (i+1)+" =");
			arr[i][j]=scan.next();
				}
			}
//		Array Traversing
		for(int i=0;i<batch;i++) {
			System.out.println("batch "+(i+1)+" best friends=");
			System.out.println("i have "+arr[i].length+" friends ");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1)+"."+arr[i][j]);
				}
			}
		

	}

}
