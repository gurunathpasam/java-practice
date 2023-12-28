package methods;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number =");
		int num=scan.nextInt();
		int square = squareNumber(num);
		System.out.println("square number of " + num + " -->" + square);
		scan.close();
	}
	static int squareNumber(int num)
	{
		return num*num;
		
	}

}