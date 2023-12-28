package com.kn.TwoDArrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the the number of batches in july month : ");
		int batch =scan.nextInt();
		
//		array declaration & creation 
		String[][] arr=new String[batch][];
		for(int i=0;i<batch;i++) {
			System.out.println("enter the size =");
			int size=scan.nextInt();
			arr[i]=new String[size];
			
		}
//		initialization
		for(int i=0;i<batch;i++) {
			System.out.println("enter the batach"+(i+1)+"friends : ");
			System.out.println("I have "+arr[i].length+" friends =");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the"+(j+1)+"name=");
				arr[i][j]=scan.next();
				
			}
		}
//		array traversing
		for(int i=0;i<batch;i++) {
			System.out.println("batach"+(i+1)+"friends : ");

			System.out.println("I have "+arr[i].length+" friends =");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1)+"."+arr[i][j]);
			
		
				

	}

}
	}
}
