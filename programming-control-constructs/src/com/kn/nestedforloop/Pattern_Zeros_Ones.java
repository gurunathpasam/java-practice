package com.kn.nestedforloop;

import java.util.Scanner;

public class Pattern_Zeros_Ones {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num =scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
					else {
						System.out.print("0");
						
					}
					
				}
			System.out.println(" ");
			}
		}
				

	}


