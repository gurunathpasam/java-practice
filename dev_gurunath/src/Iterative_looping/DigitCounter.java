package Iterative_looping;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num= scan.nextInt();
		int r,count=0;
		while(num>0) {
			r =num%10;
			count++;
			num=num/10;
			
			
		}
		System.out.println("count of digits =" +count);
		scan.close();

	}

}
