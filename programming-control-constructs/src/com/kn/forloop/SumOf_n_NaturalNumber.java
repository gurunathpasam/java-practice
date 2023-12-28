package com.kn.forloop;

import java.util.Scanner;

public class SumOf_n_NaturalNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =scan.nextInt();
		calculatesum(num);
			scan.close();
		}

	private static void calculatesum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
			System.out.println(sum);
	
		
	}

	}

}
