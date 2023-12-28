package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter  a number :  ");
		int num =scan.nextInt();
		boolean flag = isDiscount(num);
		if(flag) {
			System.out.println("discount is applicable ---");
		}
		 
			System.out.println("discount is not applicable for you ");
		
		
		scan.close();
	}

	 static boolean isDiscount(int num) {
		if(num>100) {
			return true ;
		}else 
			return false;
		
	}

}
