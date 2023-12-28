package com.kn.anagramString;

import java.util.Scanner;

public class AnagramDemo {
	public static void main(String[] args) {
//		Take input form the user
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the input1 =");
		String s1=Scan.nextLine();
		System.out.println("Enter the input2 =");
		String s2=Scan.nextLine();
//		Object creation and call the method 
		Anagram a1=new Anagram();
		boolean result=a1.isAnagram(s1,s2);
//		Print the result
		if(result) {
			System.out.println("it is a Anagram");
		}
		else {
			System.out.println("it is not a Anagram");
		}
//		Release the resources
		Scan.close();
	}

}
