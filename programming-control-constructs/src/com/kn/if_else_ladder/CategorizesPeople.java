package com.kn.if_else_ladder;

import java.util.Scanner;

public class CategorizesPeople {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your age :");
		int age =scan.nextInt();
		categorizespeople(age);
		scan.close();
	}

	  static void categorizespeople(int age) {
		if(age>=0 && age<=12)
			System.out.println("--->CHILD<---");
		else if(age>=13 && age<=19)
			System.out.println("--->TEEN<---");
		else if(age>=20 && age<=59)
			System.out.println("--->ADULT<---");
		else 
			System.out.println("--->SENIOR<---");

	}

}
