package control_constructs;

import java.util.Scanner;

public class Switch_arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("choose an option -, *, / ,% ");
		System.out.println("enter your character =");
		char c=scan.next().charAt(0);
		System.out.println("enter two values for = "+c);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		switch(c)
		{
		case '-':
			int difference=subtractNumbers(a,b);
			System.out.println("difference is =" + difference);
			break;
		case '*':
			int product= multiplyNumbers(a,b);
			System.out.println("product is =" + product);
			break;
		case '/':
			int div= divideNumber(a,b);
			System.out.println("division is =" + div);
			break;
		case '%':
			int remainder= findRemainder(a,b);
			System.out.println("remainder is =" + remainder);
			break;
		default:
			System.out.println("invalid number");
		}
	}
	static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}
	static int multiplyNumbers(int num1 , int num2)
	{
		return num1*num2;
	}
	static int divideNumber(int num1 , int num2)
	{
		return num1/num2;
	}
	static int findRemainder(int num1 , int num2)
	{
		return num1%num2;
	}
	
	

	

}
	
		
	