package com.kn.exception2;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("Bank Application Started ......");
		
		System.out.println("Enter the pin = ");
		int pin=scan.nextInt();
		
		if(pin==9999) {
			System.out.println("continue with further transaction ....");
		}else { 
			System.out.println("Invalid pin ");
		}
		}catch(Exception e) {
			System.out.println("pin should be a numeric value.....");
		}finally {
			scan.close();
			System.out.println("//scanner object clossed successfully");
		}
		System.out.println("Bank Application completed successfully.........!");
		
		

	}
}

