package com.kn.patterns;

import java.util.Scanner;

public class AlphabetsReverseLeftHalfPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter rows: ");
		int rows=scan.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i<=j) {
					System.out.print((char)(64+j)+"");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
