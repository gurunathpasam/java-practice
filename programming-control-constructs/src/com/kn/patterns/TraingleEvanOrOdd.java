package com.kn.patterns;

import java.util.Scanner;

public class TraingleEvanOrOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the rows : ");
		int rows =scan.nextInt();
		int k;
		for(int i=1;i<=rows;i++) {
			k=1;
			for(int j=1;j<=rows+(rows-1);j++) {
				if(j>=((rows+1)-i) && j<=(i+(rows-1)) && k==1) {
					System.out.print("*");
				k=0;
				}
				else {
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println(" ");
		}

	}

}
