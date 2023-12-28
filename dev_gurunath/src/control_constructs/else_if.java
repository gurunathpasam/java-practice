package control_constructs;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a value : ");
		int a = scan.nextInt();
		scan.close();
		if (a>0) {
			System.out.println("given number is positive");
		}
		else if (a<0)
		{
			System.out.println("given number is negative");
		}
		else {
			System.out.println("invalid");

		}
		
	}

}
