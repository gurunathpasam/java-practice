package com.kn.if_else;

import java.util.Scanner;

public class Discount_SeniorCitizen {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age =");
		int age =scan.nextInt();
		boolean flag =isSeniorCitizen(age);
		if(flag) 
			System.out.println("you are eligible for a senior citizen discount ");
		else
			System.out.println("you are not  eligible for a senior citizen discount ");
		scan.close();

	}

	  static boolean isSeniorCitizen(int age) {
		if(age>=60) {
			return true;
		}else {
			return false;
		}
		
	}

}
