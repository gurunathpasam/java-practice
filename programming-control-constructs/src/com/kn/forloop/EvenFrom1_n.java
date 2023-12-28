package com.kn.forloop;

import java.util.Scanner;

public class EvenFrom1_n {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=scan.nextInt();
		even(num);
		scan.close();

	}

	 static void even(int num) {
			for(int i=1;i<=num;i++) {
				if(i%2==0) {
					System.out.println(i);

					
				}

			}

		
	}

}
