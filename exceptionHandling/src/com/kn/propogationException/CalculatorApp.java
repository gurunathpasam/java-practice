package com.kn.propogationException;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Main() method Started ");
		System.out.println("Welcome to Calculator App ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First number =");
		 int a = scan.nextInt();
		System.out.println("Enter the Second number =");
		int b = scan.nextInt();
		multiply(a,b);
		System.out.println("******End Main() method ********");
		System.out.println("Thank you ");
		scan.close();
	}
	public static void multiply(int a, int b) {
		System.out.println("------>Multiply() method started ");
		int product = a*b;
		System.out.println("Multiply="+ product);
		division(a,b);
		System.out.println("Multiply() method Ended  ");

	}
	public static void division(int a, int b) {
		System.out.println("------>division() method started ");
		double q=0;
		try {
		q = a/b;
		}catch(ArithmeticException ae) {
			System.out.println("Denominator must not be Zero ");
		}
		System.out.println("Division ="+ q);
		System.out.println("division() method Ended  ");
	}

}
