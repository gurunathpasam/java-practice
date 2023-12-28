package com.kn.if_else;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year  :");
		int num = scan.nextInt();
		leapyear(num);
		scan.close();
	}

	 static void  leapyear(int num) {
		 if(num%4==0) {
			 if(num%100==0) {
				 if(num%400==0) { 
					 System.out.println("given year is leap year ");
				 }
				 else {
					 System.out.println(" not a leap year ");;
				 }
				 }
				 else {
					 System.out.println(" not a leap year ");;

				 }
			 }
		 else {
			 System.out.println(" not a leap year ");;

		 }
		
		
	}

}
