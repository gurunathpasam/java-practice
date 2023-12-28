package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age =");
		int age =scan.nextInt();
		boolean flag =isVoteEligible(age);
		if(flag) 
			System.out.println("you are eligible for voting ");
		else
			System.out.println("you are not  eligible for voting ");
		scan.close();

	}

	  static boolean isVoteEligible(int age) {
		if(age>=18) {
			return true;
		}else {
			return false;
		}
		
	}

}
