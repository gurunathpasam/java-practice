package com.kn.nestedforloop;

import java.util.Scanner;

public class InvertTraingle_Traingle {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the rows : ");
		int rows =scan.nextInt();
		scan.close();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(i<=j && (i+j)<=(rows+rows)) {
					System.out.print((char)(64+i) );
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		for(int i=2;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if((i+j)>=rows+1 && rows-1>=j-i) {
					System.out.print((char)(64+(rows-i+1)) );
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}

	}

}
