package com.kn.forloop;

import java.util.Scanner;

public class GreatestCommonDeviser {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers = ");
		int a =scan.nextInt();
		int b =scan.nextInt();
		findGCD(a,b);
		scan.close();
		

	}

	private static void findGCD(int a,int b) {
		int gcd = 1;

	    for (int i = 1; i <= a && i <= b; ++i) {

	      if (a % i == 0 && b % i == 0) {
	        gcd = i;
	      }
	    }

	    System.out.println("GCD of " + a +" and " + b + " is = " + gcd);
		
	}

}
