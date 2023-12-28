package com.kn.nested_if;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter first number   :");
		int a=scan.nextInt();
		System.out.println("enter second number :");
		int b=scan.nextInt();
		System.out.println("enter third number :");
		int c=scan.nextInt();
		islargestnumber(a,b,c);
		scan.close();

	}

	  static void islargestnumber(int a, int b, int c) {
		if(a!=b && b!=c && c!=a) {
			if(a>=b && a>=c) {
				System.out.println("a is large");
			}
				else if(b>=c && b>=a) {
					System.out.println("b is large ");
				}
				else {
					System.out.println("c is large ");
			}
		
			
		
	}

}
}
