package com.kn.whileloop;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number :");
		int num=scan.nextInt();
		System.out.println("enter the digit :");
		int digit=scan.nextInt();
		int r=0,count=0;
		
		frequencyofdigit(num,digit,r,count);
		scan.close();

	}

	 static void frequencyofdigit(int num,int digit, int r,int count) {
		while(num>0) {
			r=num%10;
			if(r==digit) {
				count++;
			}
			num=num/10;

		}
		System.out.println(count);

		
	}

}
