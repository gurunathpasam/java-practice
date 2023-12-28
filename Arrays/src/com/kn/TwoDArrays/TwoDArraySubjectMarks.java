package com.kn.TwoDArrays;

import java.util.Scanner;

public class TwoDArraySubjectMarks {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number of students  = ");
		int size1=scan.nextInt();
		System.out.println("enter the number of subjects = ");
		int size2=scan.nextInt();
//		declaration and creation
		int[][] arr=new int[size1][size2];
//		initialization 
		for(int i=0;i<size1;i++) {
			System.out.println("enter the student "+(i+1)+" data =");
			for(int j=0;j<size2;j++) {
				System.out.println("enter the subject "+(j+1)+" marks=");
				arr[i][j]=scan.nextInt();
			}
		}
//		Traversing 
		for(int i=0;i<size1;i++) {
			System.out.println("student "+ (i+1)+" data :");
			for(int j=0;j<size2;j++) {
				System.out.println("subject "+(j+1)+" marks="+arr[i][j]);
		
		

	}
			System.out.println("****************************************");

		}
	}

}
