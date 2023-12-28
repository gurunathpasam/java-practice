package com.kn.CeaserCipher;

import java.util.Scanner;

public class CeaserCipherDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		Take input Strings
		System.out.println("enter the password = ");
		String input=scan.nextLine();
		System.out.println("number of jumping steps = ");
		int n=scan.nextInt();
		
//		Object Creation and Called
		
		CeaserCipher c1=new CeaserCipher();
		char[] crr = c1.isCipher(input,n);
		
//		Traversing
		String OutputString= new String(crr);
		
			System.out.print(OutputString);
			
		
				

	}

}
