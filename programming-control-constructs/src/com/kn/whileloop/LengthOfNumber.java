package com.kn.whileloop;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number :");
		int num =scan.nextInt();
		length(num);
		scan.close();
		

	}

	 static void length(int num) {
		 int count=0;
		while(num>0) {
 			 count++;
			num=num/10;
		}
		System.out.println(count);
		
	}

}
