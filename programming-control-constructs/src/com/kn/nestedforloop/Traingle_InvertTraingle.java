package com.kn.nestedforloop;

import java.util.Scanner;

public class Traingle_InvertTraingle {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the rows : ");
		int rows =scan.nextInt();
		scan.close();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if((i+j)>=rows && rows-1>=j-i && i<=j && (i+j)<=(rows+rows)) {
					System.out.print((char)(64+i));
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}

	}

}
