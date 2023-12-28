package com.kn.if_else;

import java.util.Scanner;

public class Student_Pass_Fail {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your marks = ");
		int m=scan.nextInt();
		boolean flag=isPassOrFail(m);
		if(flag) {
			System.out.println("student is PASS ");
		}else {
			System.out.println("student is FAIL ");

		}
		scan.close();

	}

	  static boolean isPassOrFail(int m) {
		if(m>50) {
			return true;
		}else {
			return false;
		}
		
	}

}
