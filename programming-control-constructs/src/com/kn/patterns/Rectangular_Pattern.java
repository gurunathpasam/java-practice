package com.kn.patterns;

import java.util.Scanner;

public class Rectangular_Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the rows : ");
		int rows =scan.nextInt();
		System.out.println("enter the column : ");
		int column =scan.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=column;j++) {
				if( i==1|| j==1|| i==rows || j==column || i==j|| (i+j)==rows+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
