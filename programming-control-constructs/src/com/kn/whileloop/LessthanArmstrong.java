package com.kn.whileloop;

import java.util.Scanner;

public class LessthanArmstrong {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num =scan.nextInt();
		int r=0,sum=0,temp=num;
		armstrong(num,r,sum,temp);
		scan.close();
		
	}

	 static void armstrong(int num,int r,int sum,int temp) {
		while(num>0) {
			r=num%10;
			r=r*r*r;
			sum=sum+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(sum-1);
		}
		else {
			System.out.println("not a armstrong");
		}
		
		
	}

}
