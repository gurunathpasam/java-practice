package com.kn.if_else;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter  a number :  ");
		int num =scan.nextInt();
		boolean flag = isPositive(num);
		if(flag) {
			System.out.println("given number " +num+" positive number ");
		}
		else {
			System.out.println("given number " +num+" is negative ");
		}
		
		scan.close();
	}

	 static boolean isPositive(int num) {
		if(num>0) {
			return true ;
		}else 
			return false;
		
	}

}