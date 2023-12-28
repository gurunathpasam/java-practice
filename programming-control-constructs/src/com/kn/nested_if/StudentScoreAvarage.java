package com.kn.nested_if;

import java.util.Scanner;

public class StudentScoreAvarage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter first  subject marks  for 100  :");
		int test1=scan.nextInt();
		System.out.println("enter second subject marks for 100:");
		int test2=scan.nextInt();
		System.out.println("enter third subject marks 100 :");
		int test3=scan.nextInt();
		scoreaverage(test1,test2,test3);
		scan.close();

	}

	  static void scoreaverage(int test1, int test2, int test3) {
		  if (test1 >= 50 && test2 >= 50 && test3 >= 50) {
	            double averageScore = (test1 + test2 + test3) / 3;
	            if (averageScore > 50) {
	                System.out.println("Congratulations! You have passed all three tests and scored above average.");
	            } else {
	                System.out.println("Congratulations! You have passed all three tests below the average .");
	            }
	        } else {
	            System.out.println("Sorry, you have not passed all three tests.");
	        }
		
	}

}
