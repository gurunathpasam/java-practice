package com.kn.nested_if;

import java.util.Scanner;

public class EligibleForDrivingLicense {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter your age  :");
		int age=scan.nextInt();
		System.out.println("enter your vision score :");
		int score=scan.nextInt();
		drivinglicense(age,score);
		scan.close();
		

	}

	 static void drivinglicense(int age, int score) {
		if(age>=18) {
			if(score>=95) {
				System.out.println("congo----you are eligible for driving license");
			}
			else {
				System.out.println("sorry ! your score is not eligile for driving license ");
			}
		}
		else {
			System.out.println("sorry ! your age not eligile for driving license ");

		}
		
	}

}
