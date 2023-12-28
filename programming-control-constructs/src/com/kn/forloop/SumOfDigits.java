package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=scan.nextInt();
		sumOfDigits(num);
				

	}

	  static void sumOfDigits(int num) {
		int sum=0,r=0;
		for(;num>0;) {
			r=num%10;
			sum+=r;
			num=num/10;
		}
		System.out.println("the sum of digits = "+sum);
		
	}

}
