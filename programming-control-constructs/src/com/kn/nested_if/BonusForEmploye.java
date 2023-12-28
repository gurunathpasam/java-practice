package com.kn.nested_if;

import java.util.Scanner;

public class BonusForEmploye {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter your years of experiance :");
		int experiance=scan.nextInt();
		bonus(experiance);
		

	}

	 static void bonus(int experiance) {
         double bonusPercentage;

		 if (experiance >= 5) {
	            if (experiance >= 10) {
	                bonusPercentage = 10.0;
	            } else {
	                bonusPercentage = 5.0;
	            }

	            System.out.println("Congratulations! The employee is eligible for a " + bonusPercentage + "% bonus.");
	        } else {
	            System.out.println("Sorry, the employee is not eligible for a bonus.");
	        }
	}

}
