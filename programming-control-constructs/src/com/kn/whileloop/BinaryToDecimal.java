package com.kn.whileloop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =scan.nextInt();
		int r=0,sum=0,count=1;
		binarytodecimal(num,r,sum,count);
		scan.close();

	}

	 static void binarytodecimal(int num,int r,int sum,int count) {
		while(num>0) {
			r=num%10;
			r=r*count;
			sum=sum+r;
			count=count*2;
			num=num/10;
			
			
			
		}
		System.out.println(sum);
		
	}

}
