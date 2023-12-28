package com.kn.exception;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		 System.out.println("Welcome to Calculator App");
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the neumerator = ");
		 int n=scan.nextInt();
		 System.out.println("Enter the denominator = ");
		 int d=scan.nextInt();
		 double division=0;
		 //Exception handling
		 try {
			 division=n/d;
			 
		 }
		 catch(ArithmeticException ae){
			 System.out.println("Denominator must not be Zero");
			 
		 }
		 System.out.println("Division=" + division);
		 System.out.println("Thank you for the using Calculator Application");
		 scan.close();
	}

}
