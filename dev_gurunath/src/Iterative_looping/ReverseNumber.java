package Iterative_looping;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		scan.close();
		System.out.print("Reverse of given number is = ");
		for(; num>0 ; ) {
			int r = num%10;
			System.out.print(r);
			num=num/10;
		}
		

	}

}
