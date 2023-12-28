package com.kn.nestedforloop;

import java.util.Scanner;

public class NumberContinues {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter rows :");
		int rows =scan.nextInt();
		int num=1;
		for(int i =1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				
					System.out.print(num + " ");
					num++;
				
				
			}
			System.out.println(" ");
		}
	}
}