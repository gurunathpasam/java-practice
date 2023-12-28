package com.kn.forloop;

import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=scan.nextInt();
		 int sum=0;

		sumOfSquareNumber(num,sum);

	}

	 static void sumOfSquareNumber(int num,int sum) {
		for(int i=1;i<=num;i++) {
			sum=sum+(i*i);
		}
		System.out.println(sum);

		
	}

}
