package com.kn.nestedforloop;

import java.util.Scanner;

public class Pattern_Practice_Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter rows :" );
		int rows =scan.nextInt();
		for(int i =1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)<=rows && i>=j ) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
		
			}
			System.out.println(" ");
		}
	}
}