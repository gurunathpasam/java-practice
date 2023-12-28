package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("eter the age = ");
		int age =scan.nextInt();
		boolean flag=isAdult(age);
		if(flag) {
			System.out.println("---> ADULT <---");
		}else {
			System.out.println("---> not a ADULT <---");

		}
		scan.close();

	}

	  static boolean isAdult(int age) {
		if(age>21) {
			return true;
		}else {
			return false;
		}
		
	}

}
