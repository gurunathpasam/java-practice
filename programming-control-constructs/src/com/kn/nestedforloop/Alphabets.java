package com.kn.nestedforloop;

public class Alphabets {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+ (char)(64+j));
			}
			System.out.println(" ");
		}

	}

}