package methods;

import java.util.Scanner;

public class DoubleNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("double number of given numver is : " + doubleTheNumber(num));
		scan.close();
		}
	static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
