package com.kn.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num =scan.nextInt();
		reversenumber(num);
		

	}

		static void reversenumber(int num) {
			int r;
			for(int i=0;i<num;) {
				r=num%10;
				System.out.print(r);
				num=num/10;
				
			}
		
		
	}

}
