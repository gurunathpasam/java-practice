package com.kn.nested_if;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year :");
		int year=scan.nextInt();
		isleapyear(year);
		scan.close();
		

	}

	 static void isleapyear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) { 
					System.out.println("leap year");
				}
					else {
						System.out.println("not a leap year");
					}
			}
			else
				System.out.println("is a leap year");
		}
		else {
			System.out.println(" not a leap year ");
		}
			
	 }
}
			