package com.kn.customExceptionf;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Bank Application Started ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw = ");
		double withdrawAmount=scan.nextDouble();
		try {
			withdraw(withdrawAmount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void withdraw(double withdrawAmount) throws Exception {
		System.out.println("withdraw() method started ");
		if(withdrawAmount <= 15000.00) {
			System.out.println(withdrawAmount+"amount has deducted successfully !");
		}
		else {
			System.out.println("Insufficient Balance ");
			throw new InsufficientBalance("Insufficient Balance in your acount ");
		}
	}

}
