package com.kn.switch_case;

import java.util.Scanner;

public class NumberDaysMonth {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the month number :");
		int num = scan.nextInt();
		isNoOfDaysInaMonth(num);
		scan.close();		}

	 static void  isNoOfDaysInaMonth(int num) {
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 6:
			System.out.println("31 days ");
			break;
		case 2:
			System.out.println("28 days ");
			break;
		case 4:
		case 7:
		case 9:
		case 11:
			System.out.println("30 days ");
			break;
			
		
	}

	}

}
