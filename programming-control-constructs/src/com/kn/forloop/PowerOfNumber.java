package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a base :");
		int base=scan.nextInt();
		System.out.println("enter a exponent :");
		int exponent=scan.nextInt();
		calculatePower(base,exponent);

	}

	  static void calculatePower(int base, int exponent) {
		 int power=1;
		for(int i=1;i<=exponent;i++ ) {
			power=power*base;
		}
		System.out.println(power);
		
	}

}
