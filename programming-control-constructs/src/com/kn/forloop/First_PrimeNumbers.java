package com.kn.forloop;
	import java.util.Scanner;
public class First_PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number :  ");
		int num =scan.nextInt();
		printPrimes(num);
		scan.close();
	}
	  static void printPrimes(int num) {
			int i=2,count=0,c=0;
			for(;c<num;) {
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						count++;
						}
					}
					if(count==2) {
						System.out.println(i);
						c++;
					}
			i++;
			count=0;

			
		}
		
	}

	  }

