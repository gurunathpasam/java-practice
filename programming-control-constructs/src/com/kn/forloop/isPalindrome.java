package com.kn.forloop;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number :");
		int num =scan.nextInt();
		isPalindrome(num);
		scan.close();
		}
	  static void isPalindrome(int num) {
			int temp=num;
		int sum=0;int r=0;
		for(;num>0;) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("palindrome----");
		else
			System.out.println("not a palindrome ");
	}
}
