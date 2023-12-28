package com.kn.nested_if;

import java.util.Scanner;

public class QualifiedForLoan {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter your age  :");
		int age=scan.nextInt();
		System.out.println("enter your salary :");
		int income=scan.nextInt();
		loan(age,income);
		scan.close();

	}

	  static void loan(int age, int income) {
		  if (age >= 18) {
	            if (income >=20000) 
	                System.out.println("Congratulations! You are qualified for the loan.");
	             else 
	                System.out.println("Sorry, your income is below the minimum required.");
	            
	        } 
		  else {
	            System.out.println("Sorry, you must be at least 18 years old to qualify for the loan.");
	        }

		
	}

}
