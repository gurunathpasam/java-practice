package com.kn.patterns;

import java.util.Scanner;

public class Traingle_InvertTraingle_Sides {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the rows : ");
		int rows =scan.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows+(rows-1);j++) {
				if(j==(rows+1)-i || i==rows|| j==(rows-1)+i || i==j || (i+j)==(rows+rows)|| i==1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");

	}

}
}
