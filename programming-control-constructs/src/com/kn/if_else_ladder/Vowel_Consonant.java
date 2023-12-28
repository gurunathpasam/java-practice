package com.kn.if_else_ladder;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the character :");
		char inputChar = scan.next().charAt(0);
		vowel(inputChar);

	}

	private static void vowel(char inputChar) {
		if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) {
            if (inputChar >= 'a' && inputChar <= 'z') {
                // Lower-case letters
                if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                    System.out.println("Lower-case vowel");
                } else {
                    System.out.println("Lower-case consonant");
                }
            } else {
                // Upper-case letters
                if (inputChar == 'A' || inputChar == 'E' || inputChar == 'I' || inputChar == 'O' || inputChar == 'U') {
                    System.out.println("Upper-case vowel");
                } else {
                    System.out.println("Upper-case consonant");
                }
            }
        } else if (inputChar >= '0' && inputChar <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}
	


