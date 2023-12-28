package com.kn.whileloop;

import java.util.Scanner;

public class Sum_N_OddNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num =scan.nextInt();
		 int sum=0;
		 scan.close();
		oddnumber(num,sum);
 
	}

	 static void oddnumber(int num,int sum) {
		 int r=1;
		 while(num>0) {
			
			 if(r%2!=0) {
				 sum=sum+r;
				 num--;
			 }
			 r++;
		 }
		 System.out.println(sum);

		
		
	}

}
