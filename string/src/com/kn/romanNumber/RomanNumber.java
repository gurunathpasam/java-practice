package com.kn.romanNumber;

import java.util.Scanner;

public class RomanNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] srr= {"M","CM","D","CD","C","XC","L","XL","IX","V","IV","I"};
		int[] arr= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		System.out.println("Enter a number = ");
		int num=scan.nextInt();
		StringBuffer r=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			while(num>=arr[i]) {
				num =num-arr[i];
				r.append(srr[i]);
			}
		}
		System.out.println(r);
		scan.close();
	}
}
