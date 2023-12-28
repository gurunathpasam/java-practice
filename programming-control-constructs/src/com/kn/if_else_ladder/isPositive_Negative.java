package com.kn.if_else_ladder;

import java.util.Scanner;

public class isPositive_Negative {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number = ");
		int num =scan.nextInt();
		isPositive(num);
		
		scan.close();

	}

	 static void isPositive(int num) {
		if(num>0) {
			System.out.println("--->positive<---");
		}
		else if(num<0) {
			System.out.println("---> negative<---");
			}
		else {
			System.out.println("--->zero<---");
		
		}
		
		
	}

}
