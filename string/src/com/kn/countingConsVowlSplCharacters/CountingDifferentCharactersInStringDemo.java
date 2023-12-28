package com.kn.countingConsVowlSplCharacters;

import java.util.Scanner;

public class CountingDifferentCharactersInStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking the input from the user
		System.out.println("enter the string");
		String inputString = scan.nextLine();
		String inputString1 = inputString.toUpperCase();
		
		// creating the object for the class CountingDifferentCharactersInString 
		CountingDifferentCharactersInString c = new CountingDifferentCharactersInString();
		
		// calling the method to count the number of consonants in the given string
		int consonantsCount = c.countConsonants(inputString1);
		System.out.println("no.of consonants = " + consonantsCount);
		
		// calling the method to count the number of vowels in the string
		int vowelscount = c.countVowels(inputString1);
		System.out.println("no.of vowels = " + vowelscount);
		
		// calling the method to count the number of special characters in the string
		int splCharCount = c.specialCharactersCount(inputString1);
		System.out.println("no.of special characters = " + splCharCount);
		
		// calling the method to count the number of numeric values in the string
		int neumericCount = c.neumericCount(inputString1);
		System.out.println("no.of neumerica values = " + neumericCount);
	}

}