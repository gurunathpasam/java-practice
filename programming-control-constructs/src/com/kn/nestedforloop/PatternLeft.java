package com.kn.nestedforloop;

public class PatternLeft {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i+j)<=6) {
				System.out.print(6-j+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
