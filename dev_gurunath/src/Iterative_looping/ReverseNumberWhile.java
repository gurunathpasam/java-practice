package Iterative_looping;
//write a code for reverse a given  number
import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		scan.close();
		System.out.print("reverse of given number is = ");
		while(num>0) {
			int r = num%10;
			System.out.print(r);
			num=num/10;
		}

	}

}
