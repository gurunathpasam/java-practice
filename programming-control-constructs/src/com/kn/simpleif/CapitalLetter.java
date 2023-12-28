package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character = ");
		char c=scan.next().charAt(0);
		boolean flag=isCapital(c);
		if(flag) {
			System.out.println("given character is capital letter ");
		}else {
			System.out.println("given character is not a capital letter ");
			scan.close();
		}

	}

	  static boolean isCapital(char c) {
		if(c=='A' || c=='B' || c=='C' || c=='D' || c=='E'|| c=='F' ||c=='G' || c=='H' || c=='I' || c=='J' || c=='K'
				||c=='L' || c=='M' || c=='N' || c=='O' || c=='P' ||c=='Q' || c=='R' || c=='S' || c=='T' || c=='U' || c=='V'
				||c=='W' || c=='X' || c=='Y' || c=='Z') {
			return true;
		}else {
			return false;
		}
		
	}

}
