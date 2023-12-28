package com.kn.whileloop;

import java.util.Scanner;

public class Product_digits {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number :");
		int num=scan.nextInt();
		int r=0,product=1;
		sumofdigit(num,r,product);
		scan.close();

	}

	 static void sumofdigit(int num,int r, int product) {
		 while(num>0) {
			 r=num%10;
			 product=product*r;
			 num=num/10;
					 
		 }
		 System.out.println("product of digits in the number :" +product);
		
		
	}

}
