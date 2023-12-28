package com.kn.whileloop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =scan.nextInt();
		squareroot(num);
		scan.close();

	}

	 static void squareroot(int num) {
		int i=1;
		while(i<=num) {
			if(i*i==num) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
