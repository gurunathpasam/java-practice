package com.kn.countOfEachCharacters;

import java.util.Scanner;

public class CountOfEachCharactersDemo{
	
	public static void main(String[] args) {
//		Take input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input =");
		String inputstring=scan.nextLine();
//		Object creation  and call the method 
		
		CountOfEachCharacters c1= new CountOfEachCharacters();
		c1.countOfEachCharacter(inputstring);
		
		
		
		
		
	}
}