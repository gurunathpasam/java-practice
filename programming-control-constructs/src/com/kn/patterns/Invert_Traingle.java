package com.kn.patterns;

import java.util.Scanner;

public class Invert_Traingle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the rows : ");
		int rows =scan.nextInt();
		scan.close();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(i<=j && (i+j)<=(rows+rows)) {
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
