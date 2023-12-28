package com.kn.multipleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started execution");
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("Enter the array size =");
			int[] arr=new int[scan.nextInt()];
			
			System.out.println("enter the index =");
			int index=scan.nextInt();
			System.out.println("enter the Element =");
			int element=scan.nextInt();
			System.out.println("enter the numerator =");
			int numerator=scan.nextInt();
			System.out.println("enter the denominator =");
			int denominator=scan.nextInt();
			
			double division=numerator/denominator;
		}
		catch(ArithmeticException ae) {
			System.out.println("Denominator must not be zero ");
			ae.printStackTrace();
		}
		catch(InputMismatchException ime) {
			System.out.println("input type miss matching ");
			ime.printStackTrace();
		}
		catch(NegativeArraySizeException nae) {
			System.out.println("Array must not be negative ");
			nae.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}finally {
			scan.close();
			
		}
		System.out.println("Program execution completed successfully!!");

	}

}
