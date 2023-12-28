package com.kn.nestedforloop;

import java.util.Scanner;

public class TraingleAndInvert_Pattern {

	public static void main(String[] args) {

		for(int i =1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if((i+j)<=10 && i<=j ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		
			}
			System.out.println(" ");
		}
		for(int i =1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if((i+j)>=10 && i>=j ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		
			}
			System.out.println(" ");
		}
	}
}