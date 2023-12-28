package control_constructs;

import java.util.Scanner;

public class if_else_ladder {

	public static void main(String[] args) {
		System.out.println("choose an operation +,-,*,/");
		System.out.println("+-->addition");
		System.out.println("- -->subtraction");
		System.out.println("* -->multiplication");
		System.out.println("/ -->division");
		
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		System.out.println("enter two values for = "+c);
		int a =scan.nextInt();
		int b =scan.nextInt();
		scan.close();
		if (c=='+')
		{
			System.out.println("addition of numbers " +a+ "," +b+ "=" +(a+b));
		}
		else if(c=='-')
		{
			System.out.println("subtraction of numbers " +a+ "," +b+ "=" + (a-b));
		}
		else if(c=='*')
		{
			System.out.println("product of numbers " +a+ "," +b+ "=" +(a*b));
		}
		else if(c=='/')
		{
			System.out.println("division of numbers " +a+ "," +b+ "=" +(a/b));
		}
		else
		{
			System.out.println("invalid number");
		}
		
	}

}