package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter String to be reversed ");
		String input=scan.nextLine();
//		 object creation and method calling 
		ReverseString s1 =new ReverseString();
		String output=s1.revserseString(input);
		
//		print the reverse array 
		System.out.println("Reversed string is ="+ output);

	}

}
