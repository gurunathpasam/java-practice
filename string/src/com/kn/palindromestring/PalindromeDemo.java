package com.kn.palindromestring;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("the input string is: ");
		String inputstring =scan.next();
		inputstring=inputstring.toLowerCase();
		
//		Create Object of palindrome string class
		Palindrome p1=new Palindrome();
		p1.isPalindromeString(inputstring);
		scan.close();
		
		
		

	}

}
