package com.kn.if_else;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("enter your marks = ");
		int num=scan.nextInt();
		boolean flag=multiple(num);
		if(flag) {
			System.out.println( + num + " is a multiple of 10");
		}else {
			System.out.println( + num+ " is not multiple of 10 ");

		}
		scan.close();

	}

	  static boolean multiple(int num) {
		if(num%10==0) {
			return true;
		}else {
			return false;
		}
	  }
}
		