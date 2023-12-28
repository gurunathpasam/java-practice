package com.kn.gcd_number;

import java.util.Scanner;

public class GcdNumberDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number = ");
		int a=scan.nextInt();
		System.out.println("Enter the second nunber =");
		int b=scan.nextInt();
		//Object creation and method calling
		GcdNumber g1=new GcdNumber();
		int result=g1.gcd(a,b);
		//Print the result
		System.out.println("Gcd is ="+result);
		//Close the resrces
		
		scan.close();
				
	}

}
