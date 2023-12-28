package com.kn.number_series;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number ");
		int num =scan.nextInt();
		ispositive(num);
		
	}

	  static void ispositive(int num) {
		  if (num>=0)
			  System.out.println("positive");
		  else if(num<0)
			  System.out.println("negative");
		
	}
	

}
