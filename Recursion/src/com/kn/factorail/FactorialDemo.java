package com.kn.factorail;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num=scan.nextInt();
		//Object creation and method calling
		Factorial f1=new Factorial();
		int result=f1.fact(num);
		//Print the output 
		System.out.println(result);
		scan.close();
	}

}
