package com.kn.ArithmeticExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticCalculatorApp {

	public static void main(String[] args) {
		System.out.println("***********Calculator App started *************");
		
		
		addition();
		subtraction();
		try {
		multiplication();
		}catch(Exception e) {
			System.out.println("Exception Handled in main() method ");
		}
		try {
			division();
			}catch(Exception e) {
				System.out.println("Exception Handled in Main() Method ");
			}
		
	}

	public static void addition() {
		System.out.println("addition() method started ");

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first input = ");
		int input1=scan.nextInt();
		
		System.out.println("Enter the second input = ");
		int input2=scan.nextInt();
		int sum=input1+input2;
		System.out.println("Addition = "+sum);
		System.out.println("additon() method End ");
	}
	public static void subtraction() {
		System.out.println("subtraction() method Starting ");
		Scanner scan=new Scanner(System.in);
		int result=0;
		try {
		System.out.println("Enter input1 for subtration = ");
		int a=scan.nextInt();
		System.out.println("Enter input2 for subtration = ");
		int b=scan.nextInt();
		result=a-b;
		}catch(InputMismatchException ime) {
			System.out.println("Exception Handled: input must be and integer ");
			ime.printStackTrace();
		}
		
		System.out.println("Subtraction = "+ result);
		System.out.println("subtraction() method end ");
		
	}

	public static void multiplication() throws IOException {
		System.out.println("multiplication() method Started ");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int num1=br.read();
		int num2=br.read();
		int result=num1*num2;
		System.out.println("multiplication = "+ result);
		System.out.println("multiplication() method Ended");
		}

	private static void division() throws ArithmeticException, InputMismatchException {
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
//			System.out.println("inside divide() : Exception Handled: denominator must not be zero ");
			throw ae;
		
		}
		finally {
			System.out.println("division() method Ended ");
		}
		
	}

}
