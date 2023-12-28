package com.kn.whileloop;

import java.util.Scanner;

public class LargestDigit_Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =scan.nextInt();
		largestdigit(num);
		scan.close();
		

	}

	 static void largestdigit(int num) {
		int digit,highestdigit=-1;
		while(num>0) {
			digit=num%10;
			if(digit>highestdigit) {
				highestdigit=digit;
				num=num/10;
				System.out.println(highestdigit);
			}
			
		}
		
	}

}
