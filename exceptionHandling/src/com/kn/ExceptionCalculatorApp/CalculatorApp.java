package com.kn.ExceptionCalculatorApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Calculator Application Started");
		try {
		divide();
		}catch(Exception e) {
			System.out.println("inside main() : Exception Handled: denominator must not be zero");
		}finally {
		System.out.println("*****end*****");
		}
	}

	public static void divide() throws ArithmeticException, InputMismatchException, Exception{
		System.out.println("divide() method started ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numerator = ");
		int n=scan.nextInt();
		System.out.println("Enter denominator = ");
		int d=scan.nextInt();
		double division=0;
		
		try {
			division=n/d;
			
		}catch(ArithmeticException ae) {
			System.out.println("inside divide() : Exception Handled: denominator must not be zero ");
			throw ae;
		
		}
		finally {
		System.out.println("Division=" + division);
		System.out.println("divide() method ended ");
		}
		
	}

}
