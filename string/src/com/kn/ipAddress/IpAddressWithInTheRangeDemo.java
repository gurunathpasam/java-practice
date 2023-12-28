package com.kn.ipAddress;

import java.util.Scanner;

public class IpAddressWithInTheRangeDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the IpAddress =");
		String inputstring=scan.nextLine();
		
		IsValidIpAddress v1=new IsValidIpAddress();
		boolean isValid=v1.isValid(inputstring);
		if(isValid) {
			System.out.println("it is valid");
			
		}else {
			System.out.println("not a valid ");
		}
		
		
		
	}

}
