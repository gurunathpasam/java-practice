package control_constructs;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value : ");
		int a = scan.nextInt();
		scan.close();
		if (a%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");

		}
		
	}

}
