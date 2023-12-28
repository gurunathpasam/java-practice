package com.kn.forloop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =scan.nextInt();
		calculateFactorial(num);
			scan.close();
	}

	private static void calculateFactorial(int num) {
		int factorial=1;
		for (int i=1;i<=num;i++) {
//			factorial*=i;
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
	}

}
