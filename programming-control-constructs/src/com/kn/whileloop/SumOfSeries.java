package com.kn.whileloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =scan.nextInt();
		sumofseries(num);
		scan.close();

	}

	 static void sumofseries(int num) {
		double i=1,sum=0;
		while(i<=num) {
			sum=sum+(1/i);
			i++;
			
		}
		System.out.println(sum);
		
	}

}
