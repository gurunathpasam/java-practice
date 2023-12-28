package com.kn.forloop;

import java.util.Scanner;

public class Armstrong1_n {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num =scan.nextInt();
		int r=0,sum=0,temp=0,j=0;
		armstrong(num,r,sum,temp,j);
		scan.close();
		}

	 static void armstrong(int num, int r, int sum, int temp, int j) {
		System.out.println("0");
		for(j=1;j<=num;j++) {
			temp=j;
			for(;j>0;) {
				r=j%10;
				r=r*r*r;
				sum=sum+r;
				j=j/10;
			}
			if(temp==sum) {
 				System.out.println(temp);
			}
			sum=0;
			j=temp;
			
		}
		
	}
}

	 
